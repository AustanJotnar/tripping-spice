package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest 
{
    Player p1 = new Player(0, "Alice");
    Player p2 = new Player(1, "Bob");
    TicTacToe game = new TicTacToe(p1, p2);  

    @Test
    public void testTicTacToeGetPlayer() 
    {
        assertEquals(0, game.getPlayer(0).getId());
        assertEquals(1, game.getPlayer(1).getId());
    }

    @Test
    public void testSwitchPlayer()
    {
    	game.switchPlayer();
    	assertEquals(1, game.getActivePlayer().getId());
        game.switchPlayer();
        assertEquals(0, game.getActivePlayer().getId());
    }
    @Test
    public void testCheckForWinnerNoWinner()
    {
        int test = game.checkForWinner();
        assertEquals(0, test);
    }
    @Test
    public void testCheckForWinnerXWins()
    {
        int test = 0;
        game.gameBoard.resetBoard();
        //..x
        //.x.
        //x..  
        for(int i = 2; i < 7; i += 2)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);
        
        game.gameBoard.resetBoard();
        //x..  
        //.x. 
        //..x   
        for(int i = 0; i < 9; i += 4)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);

        game.gameBoard.resetBoard();
        //xxx  
        //... 
        //...   
        for(int i = 0; i < 3; i++)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);
        
        game.gameBoard.resetBoard();
        //...  
        //xxx 
        //...  
        for(int i = 3; i < 6; i++)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);

        game.gameBoard.resetBoard();
        //... 
        //... 
        //xxx  
        for(int i = 6; i < 9; i++)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);

        game.gameBoard.resetBoard();
        //x..  
        //x.. 
        //x..  
        for(int i = 0; i < 7; i += 3)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);

        game.gameBoard.resetBoard();
        //.x.  
        //.x. 
        //.x.  
        for(int i = 1; i < 8; i += 3)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);
        game.gameBoard.resetBoard();
        //..x  
        //..x 
        //..x  
        for(int i = 2; i < 9; i += 3)
        {
            game.gameBoard.addToBoard('X', i);
        }
        test = game.checkForWinner();
        assertEquals(1, test);
    }
    @Test
    public void testCheckForWinnerOWins()
    {
        int test = 0;
        game.switchPlayer();
        game.gameBoard.resetBoard();
        //..o
        //.o.
        //o..  
        for(int i = 2; i < 7; i += 2)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);
        
        game.gameBoard.resetBoard();
        //o..  
        //.o. 
        //..o   
        for(int i = 0; i < 9; i += 4)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);

        game.gameBoard.resetBoard();
        //ooo  
        //... 
        //...   
        for(int i = 0; i < 3; i++)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);
        
        game.gameBoard.resetBoard();
        //...  
        //ooo 
        //...  
        for(int i = 3; i < 6; i++)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);

        game.gameBoard.resetBoard();
        //... 
        //... 
        //ooo  
        for(int i = 6; i < 9; i++)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);

        game.gameBoard.resetBoard();
        //o..  
        //o.. 
        //o..  
        for(int i = 0; i < 7; i += 3)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);

                game.gameBoard.resetBoard();
        //.o.  
        //.o. 
        //.o.  
        for(int i = 1; i < 8; i += 3)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);
                game.gameBoard.resetBoard();
        //..o  
        //..o 
        //..o  
        for(int i = 2; i < 9; i += 3)
        {
            game.gameBoard.addToBoard('O', i);
        }
        test = game.checkForWinner();
        assertEquals(2, test);
    }
    @Test
    public void testCheckForWinnerDraw()
    {
        //xxo
        //oox
        //xxo
        game.gameBoard.addToBoard('X', 0);
        game.gameBoard.addToBoard('X', 1);
        game.gameBoard.addToBoard('O', 2);
        game.gameBoard.addToBoard('O', 3);
        game.gameBoard.addToBoard('O', 4);
        game.gameBoard.addToBoard('X', 5);
        game.gameBoard.addToBoard('X', 6);
        game.gameBoard.addToBoard('X', 7);
        game.gameBoard.addToBoard('O', 8);
        game.switchPlayer();

        int test = game.checkForWinner();
        assertEquals(3, test);
    }
    
    @Test
    public void testAddPlayers()
    {
        game.addPlayers(p1, p2);    
        assertEquals("Alice" , p1.getName());
        assertEquals("Bob", p2.getName());
        assertEquals(0, p1.getId());
        assertEquals(1, p2.getId());
    }   

}

