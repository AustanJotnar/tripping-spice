package is.ru.tictactoe;
import static spark.Spark.*;
import spark.*;


public class PlayGame
{
    public static String play(TicTacToe game, int position)
    {
        int pos = position;
        char token = game.getActivePlayer().getToken();
        if(game.checkForWinner() == 0)
		{   
    		game.gameBoard.addToBoard(token, pos);
            if(game.checkForWinner() == 1 || game.checkForWinner() == 2 )
            {
            	return Integer.toString(position) + token + game.getActivePlayer().getName() + " won!";
            }
            else if(game.checkForWinner() == 3) 
        	{
            	return Integer.toString(position) + token + "It's a draw!";
        	}
            game.switchPlayer();
		}
		return Integer.toString(position) + token + game.getActivePlayer().getName() + "'s move";
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

                return play(game, number);
                	
			}
		});

	}
}
