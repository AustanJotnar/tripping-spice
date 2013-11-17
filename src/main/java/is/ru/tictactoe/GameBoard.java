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
    
    public int addToBoard(char token, int pos)
    {
    	if( (token == 'X' || token == 'O') 
            && pos >= 0 && pos < 9 && this.board[pos] == 'f')
    	{
    		this.board[pos] = token;
            return pos;
    	}
        else
        {
            return -1;
        }
    }
    
    public void resetBoard()
    {
    	for(int i = 0; i < 9; i++)
    	{
    		this.board[i] = 'f';
    	}
    }

    public boolean emptyCell(int c)
    {
    	if(c >=0 && c < 9)
    	{
    		if(this.board[c] == 'f')
    		{
    			return true;
    		}
    		else
    		{
    			return false;
    		}
    	}
    	else
    	{
    		return false;
    	}
    }


}