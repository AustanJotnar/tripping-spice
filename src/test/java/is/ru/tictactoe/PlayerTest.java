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
    @Test
    public void testSetId() 
    {
        player2.setId(1);
        assertEquals(1, player2.getId());
    }
    @Test
    public void testSetToken() 
    {
        player2.setToken(0);
        assertEquals('X', player2.getToken());
        player2.setToken(1);
        assertEquals('O', player2.getToken());
        player2.setToken(3);
        assertEquals('O', player2.getToken());
    }
    @Test
    public void testSetName() 
    {
        player2.setName("Haraldur");
        assertEquals("Haraldur", player2.getName());
    }
}

