package is.ru.tictactoe;


public class GameBoard 
{
    private char[] board;
    public GameBoard()
    {
    	this.board = new char[9];
    	this.resetBoard();
    }
    
    public char[] getBoard()
    {
    	return this.board;
    }
    
    public void addToBoard(char token, int pos)
    {
    	if( (token == 'X' || token == 'O') && this.board[pos] == 'f')
    	{
    		this.board[pos] = token;
    	}
    }
    
    public void resetBoard()
    {
    	for(int i = 0; i < 9; i++)
    	{
    		this.board[i] = 'f';
    	}
    }  
}