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
        	test[i] = ' ';
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
        assertTrue(gb.emptyCell(8));
        gb.addToBoard('X', 0);
        assertFalse(gb.emptyCell(0));
        assertFalse(gb.emptyCell(-1));
        assertFalse(gb.emptyCell(9));
    }

    @Test
    public void testGameBoardAddToBoardXon0() 
    {
        gb.addToBoard('X', 0);
        assertEquals('X', gb.getBoard()[0]);
    }
    @Test
    public void testGameBoardAddToBoardOon0() 
    {
        gb.addToBoard('O', 0);
        gb.addToBoard('X', 0);
        assertEquals('O', gb.getBoard()[0]);
    }
    @Test
    public void testGameBoardAddToBoardXon9() 
    {
        int test = gb.addToBoard('X', 9);
        assertEquals(-1, test);
    }
    @Test
    public void testGameBoardAddToBoardXonNeg1() 
    {
        int test = gb.addToBoard('X', -1);
        assertEquals(-1, test);
    }
    @Test
    public void testGameBoardAddToBoardWrongToken() 
    {
        int test = gb.addToBoard('W', 0);
        assertEquals(-1, test);
    }
}

