package is.ru.tictactoe;

public class TicTacToe 
{
    private Player activePlayer;
    private Player player1;
    private Player player2;
    public GameBoard gameBoard;

    public TicTacToe(Player p1, Player p2)
    {
    	this.activePlayer = p1;
    	this.player1 = p1;
    	this.player2 = p2;
    	this.gameBoard = new GameBoard();
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
    
    
    //Returns 0 for not finished
    //Returns 1 for Player 1 has won
    //Returns 2 for Player 2 has won
    //Returns 3 for draw
    public int checkForWinner()
    {
        boolean draw = true;
        for(int i = 0; i < 9; i++)
        {
            if (this.gameBoard.getBoard()[i] != 'X' && this.gameBoard.getBoard()[i] != 'O')
            {
                draw = false;
            }
        }

        if(draw)
        {
            return 3;
        }

        else if (((this.gameBoard.getBoard()[0] == 'X' && this.gameBoard.getBoard()[1] == 'X' && this.gameBoard.getBoard()[2] == 'X') ||
                  (this.gameBoard.getBoard()[3] == 'X' && this.gameBoard.getBoard()[4] == 'X' && this.gameBoard.getBoard()[5] == 'X') ||
                  (this.gameBoard.getBoard()[6] == 'X' && this.gameBoard.getBoard()[7] == 'X' && this.gameBoard.getBoard()[8] == 'X') ||
                  (this.gameBoard.getBoard()[0] == 'X' && this.gameBoard.getBoard()[3] == 'X' && this.gameBoard.getBoard()[6] == 'X') ||
                  (this.gameBoard.getBoard()[1] == 'X' && this.gameBoard.getBoard()[4] == 'X' && this.gameBoard.getBoard()[7] == 'X') ||
                  (this.gameBoard.getBoard()[2] == 'X' && this.gameBoard.getBoard()[5] == 'X' && this.gameBoard.getBoard()[8] == 'X') ||
                  (this.gameBoard.getBoard()[0] == 'X' && this.gameBoard.getBoard()[4] == 'X' && this.gameBoard.getBoard()[8] == 'X') ||
                  (this.gameBoard.getBoard()[2] == 'X' && this.gameBoard.getBoard()[4] == 'X' && this.gameBoard.getBoard()[6] == 'X')) &&
                  activePlayer == player1)
        {
            return 1;
        }

        else if (((this.gameBoard.getBoard()[0] == 'O' && this.gameBoard.getBoard()[1] == 'O' && this.gameBoard.getBoard()[2] == 'O') ||
                  (this.gameBoard.getBoard()[3] == 'O' && this.gameBoard.getBoard()[4] == 'O' && this.gameBoard.getBoard()[5] == 'O') ||
                  (this.gameBoard.getBoard()[6] == 'O' && this.gameBoard.getBoard()[7] == 'O' && this.gameBoard.getBoard()[8] == 'O') ||
                  (this.gameBoard.getBoard()[0] == 'O' && this.gameBoard.getBoard()[3] == 'O' && this.gameBoard.getBoard()[6] == 'O') ||
                  (this.gameBoard.getBoard()[1] == 'O' && this.gameBoard.getBoard()[4] == 'O' && this.gameBoard.getBoard()[7] == 'O') ||
                  (this.gameBoard.getBoard()[2] == 'O' && this.gameBoard.getBoard()[5] == 'O' && this.gameBoard.getBoard()[8] == 'O') ||
                  (this.gameBoard.getBoard()[0] == 'O' && this.gameBoard.getBoard()[4] == 'O' && this.gameBoard.getBoard()[8] == 'O') ||
                  (this.gameBoard.getBoard()[2] == 'O' && this.gameBoard.getBoard()[4] == 'O' && this.gameBoard.getBoard()[6] == 'O')) &&
                  activePlayer == player2)
        {
            return 2;
        }
        else
        {
            return 0;
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

