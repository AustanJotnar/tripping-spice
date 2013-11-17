package is.ru.tictactoe;

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
    		return this.player1;
    	}
    	else
    	{
    		return this.player2;
    	}
    }

    public int getActivePlayer()
    {
    	return this.activePlayer;
    }

    public void switchPlayer()
    {
    	if(this.activePlayer == 0)
    	{
    		this.activePlayer = 1;
    	}
    	else
    	{
    		this.activePlayer = 0;
    	}
    }

    public static void main(String[] args) 
    {

		TicTacToe game = new TicTacToe();    
		
	    System.out.println("TicTacToe");  
    }
}

