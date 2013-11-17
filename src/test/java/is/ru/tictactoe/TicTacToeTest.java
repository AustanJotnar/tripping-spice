package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest 
{
    Player p1 = new Player(0, "Alice");
    Player p2 = new Player(1, "Bob");
    TicTacToe game = new TicTacToe(p1, p2);  

    @Test
    public void testTicTacToe() 
    {
        assertEquals(0, game.getPlayer(0).getId());
    }

    @Test
    public void testSwitchPlayer()
    {
    	game.switchPlayer();
    	assertEquals(1, game.getActivePlayer().getId());
    }
    @Test
    public void testCheckForWinner()
    {
        int test = game.checkForWinner();
        assertEquals(0, test);
    }
}

