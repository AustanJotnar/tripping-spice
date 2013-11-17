package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest 
{
    TicTacToe game = new TicTacToe();	

    @Test
    public void testTicTacToe() 
    {
        assertEquals(0, game.getPlayer(0));
    }
}

