package is.ru.tictactoe;
import static spark.Spark.*;
import spark.*;


public class PlayGame{

	public static void main(String[] args)
	{

// ## JUST SOME BASE CODE BASED ON HELLOWORLD.JAVA FROM HELLOWORLD DEMO ##

//		staticFileLocation("/public");
//		post(new Route("/add")
//		{
//			@Override
//			public Object handle(Request request, Response response)
//			{
//				Player player0 = new Player(0, (request.queryParams("Player0")));
//				Player player1 = new Player(1, (request.queryParams("Player1")));
//				return 0;
//			}
//
//		});
		
	staticFileLocation("/public");
	post(new Route("/add") {
             @Override
             public Object handle(Request request, Response response) {
                 return "Hhhoooowwwdyhowww";
             }
         });

		System.out.println("PlayGame"); 


	}
}