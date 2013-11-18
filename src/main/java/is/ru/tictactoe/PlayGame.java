package is.ru.tictactoe;
import static spark.Spark.*;
import spark.*;


public class PlayGame
{
	// public void play(tictactoe game)
	// {
	// 	char token = 'f';
	// 	int pos = 0;
	// 	while(game.checkForWinner() == 0)
 //        {    
            
 //           game.
            
 //            System.out.println(("Player " + token + ". Make a move!");
            
 //            //TODO get move from HTML

 //            game.gameBoard.addToBoard(token, pos);
            
 //            game.switchPlayer()
 //            ttt.display();
 //        }
	// }
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