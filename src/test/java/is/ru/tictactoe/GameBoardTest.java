package is.ru.tictactoe;
import static org.junit.Assert.*;
import org.junit.Test;

public class GameBoardTest 
{
    GameBoard gb = new GameBoard();    
    @Test
    public void testGameBoardEmpty() 
    {
        char test[] = new char[9];
        for(int i = 0; i < 9; i++)
        {
        	test[i] = 'f';
        }
        assertArrayEquals(test, gb.getBoard());
    }

    @Test
    public void testGameBoardSize() 
    {
        assertEquals(9, gb.getBoard().length);
    }
    
    @Test
    public void testGameBoardEmptyCell() 
    {
        assertEquals(true, gb.emptyCell(8));
    }

    @Test
    public void testGameBoardAddToBoardXon0() 
    {
        gb.addToBoard('X', 0);
        assertEquals('X', gb.getBoard()[0]);
    }
}

