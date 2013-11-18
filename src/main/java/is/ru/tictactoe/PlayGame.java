package is.ru.tictactoe;
import static spark.Spark.*;
import spark.*;


public class PlayGame
{
	public void play(TicTacToe game)
	{
		int pos = 0;
		while(game.checkForWinner() == 0)
        {    
           	//TODO print into HTML
           	System.out.println("Player " + game.getActivePlayer().getToken() + ". Make a move!");
            
            //TODO JavaScript get move from HTML and mark cell with game.activePlayer.getToken()

            game.gameBoard.addToBoard(game.getActivePlayer().getToken(), pos);
            
            if(game.checkForWinner() == 0)
            {
            	game.switchPlayer();
            }
        }
        //TODO print Nicely into HTML
        if(game.checkForWinner() == 3) 
        {
        	System.out.println("The game was draw!");
        }
        else
        {
        	System.out.println("Player " + game.getActivePlayer().getName() + " is the Winner!");
        }
	}
	public static void main(String[] args)
	{
		staticFileLocation("/public");
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
					Player player0 = new Player(0, name0);
					Player player1 = new Player(1, name1);
					return name0 + " " + name1;	
				}					
             }
         });
		System.out.println("PlayGame"); 
	}

}