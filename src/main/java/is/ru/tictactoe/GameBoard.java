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
            && pos >= 0 && pos < 9 && this.emptyCell(pos))
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
    		this.board[i] = ' ';
    	}
    }

    public boolean emptyCell(int c)
    {
    	if(c >= 0 && c < 9 && this.board[c] == ' ')
    	{
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
