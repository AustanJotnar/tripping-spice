package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest 
{
    @Test
    public void testPlayer() 
    {
		Player player = new Player(1, "Jon");
        assertEquals("Jon", player.getName());
    }
}

