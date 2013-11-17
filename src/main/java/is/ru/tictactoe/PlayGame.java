package is.ru.tictactoe;
import static spark.Spark.*;
import spark.*;


public class PlayGame{

	public static void main(String[] args)
	{

// ## JUST SOME BASE CODE BASED ON HELLOWORLD.JAVA FROM HELLOWORLD DEMO ##

	
	staticFileLocation("/public");
	post(new Route("/add") {
             @Override
             public Object handle(Request request, Response response) {
                String name0 = (String.valueOf(request.queryParams("player0")));
				String name1 = (String.valueOf(request.queryParams("player1")));
				
				Player player0 = new Player(0, name0);
				Player player1 = new Player(1, name1);
				return name0 + " " + name1;
             }
         });

		System.out.println("PlayGame"); 


	}
}