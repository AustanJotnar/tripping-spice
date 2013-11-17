package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest 
{
	Player player = new Player(1, "Jon");
    
    @Test
    public void testPlayerName() 
    {
        assertEquals("Jon", player.getName());
    }

    @Test
    public void testPlayerId()
    {
    	assertEquals(1, player.getId());
    }
}

