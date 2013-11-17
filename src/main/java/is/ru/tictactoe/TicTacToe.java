package is.ru.tictactoe;

import static spark.Spark.*;
import spark.*;


public class TicTacToe 
{
    private int activePlayer;
    private int player1;
    private int player2;
    private GameBoard gameBoard;

    public TicTacToe()
    {
    	this.activePlayer = 0;
    	this.player1 = 0;
    	this.player2 = 1;
    	GameBoard gameBoard = new GameBoard();
    }

    public int getPlayer(int player) 
    {
    	if(player == 0)
    	{
    		return player1;
    	}
    	else
    	{
    		return player2;
    	}
    }

    public static void main(String[] args) 
    {
	staticFileLocation("/public");
	post(new Route("/add") {
             @Override
             public Object handle(Request request, Response response) {
                 return "Hhhoooowwwdyhowww";
             }
         });



	    System.out.println("TicTacToe");  
    }
}

