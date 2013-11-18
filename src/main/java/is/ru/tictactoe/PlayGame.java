package is.ru.tictactoe;
import static spark.Spark.*;
import spark.*;


public class PlayGame
{
	public static String play(TicTacToe game, int position)
	{
		int pos = position;
		if(game.checkForWinner() == 0)
        {    
           	//TODO print into HTML
           	System.out.println("Player " + game.getActivePlayer().getToken() + ". Make a move!");
            
            //TODO JavaScript get move from HTML and mark cell with game.activePlayer.getToken()

            char token = game.getActivePlayer().getToken();
            game.gameBoard.addToBoard(token, pos);
			game.switchPlayer();

			return Integer.toString(position) + token + game.getActivePlayer().getName() + "'s move";
           
        }
        //TODO print Nicely into HTML
        else if(game.checkForWinner() == 3) 
        {
        	System.out.println("The game was draw!");
        	return "9DIt's a draw!";
        }
        else
        {
        	System.out.println("Player " + game.getActivePlayer().getName() + " is the Winner!");
        	return "9W" + game.getActivePlayer().getName() + " won!";
        }
	}

	public static void main(String[] args)
	{

		final Player player0 = new Player(0);
		final Player player1 = new Player(1);
		final TicTacToe game = new TicTacToe();

		staticFileLocation("/public");
		if(System.getenv("PORT") == null)
		{
			setPort(4567);
		}	
		else
		{
			setPort(Integer.valueOf(System.getenv("PORT")));
		}

		post(new Route("/add") 
		{
             @Override
             public Object handle(Request request, Response response) {
                String name0 = (String.valueOf(request.queryParams("player0")));
				String name1 = (String.valueOf(request.queryParams("player1")));
				
				if(name0 == "" && name1 == "")
				{
					return "Insert names";
				}
				else if(name0 == "" && name1 != "")
				{
					return "Insert name for player X";					
				}
				else if(name0 != "" && name1 == "")
				{
					return "Insert name for player O";
				}
				else
				{
					player0.setName(name0);
					player1.setName(name1);
					game.addPlayers(player0, player1);
					return name0 + " " + name1;	
				}					
             }
         });

		post(new Route("/click") 
		{
             @Override
             public Object handle(Request request, Response response) {
                String cell = (String.valueOf(request.queryParams("cell")));
                
                int number = (Integer.valueOf(cell.replaceFirst(".*?(\\d+).*","$1")));

                if(game.getActivePlayer() != null)
                {
                	return play(game, number);
                	 
                }
                return "Add players to game"; 	
			}
		});

	}
}
