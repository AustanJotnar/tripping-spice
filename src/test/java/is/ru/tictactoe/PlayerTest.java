package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest 
{
    @Test
    public void testPlayerName() 
    {
		Player player = new Player(1, "Jon");
        assertEquals("Jon", player.getName());
    }

    @Test
    public void testPlayerId()
    {
    	Player player = new Player(1, "Jon");
    	
    }
}

