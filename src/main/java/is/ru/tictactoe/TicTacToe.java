package is.ru.tictactoe;

public class TicTacToe 
{
    private Player activePlayer;
    private Player player1;
    private Player player2;
    private GameBoard gameBoard;

    public TicTacToe(Player p1, Player p2)
    {
    	this.activePlayer = p1;
    	this.player1 = p1;
    	this.player2 = p2;
    	GameBoard gameBoard = new GameBoard();
    }
    
    public Player getPlayer(int player) 
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

    public Player getActivePlayer()
    {
    	return this.activePlayer;
    }

    public void switchPlayer()
    {
    	if(this.activePlayer == player1)
    	{
    		this.activePlayer = player2;
    	}
    	else
    	{
    		this.activePlayer = player1;
    	}
    }

    public static void main(String[] args) 
    {
        Player p1 = new Player(0, "Alice");
        Player p2 = new Player(1, "Bob");

		TicTacToe game = new TicTacToe(p1, p2);    
		
	    System.out.println("TicTacToe");  
    }
}

