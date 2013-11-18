package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest 
{
	Player player = new Player(1, "Jon");
    Player player2 = new Player(0);
    
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
    @Test
    public void testPlayerToken()
    {
        assertEquals('O', player.getToken());
    }
    @Test
    public void testSingleParmConstructName()
    {
        assertEquals(null, player2.getName());
    }
    @Test
    public void testSingleParmConstructToken()
    {
        assertEquals('X', player2.getToken());
    }

}

