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
        assertArrayEquals(gb.getBoard(), test);
    }

    @Test
    public void testGameBoardSize() 
    {
        assertEquals(gb.getBoard().length, 9);
    }
    
    @Test
    public void testGameBoardAddToBoardXon0() 
    {
        gb.addToBoard('X', 0);
        assertEquals(gb.getBoard()[0], 'X');
    }

}

