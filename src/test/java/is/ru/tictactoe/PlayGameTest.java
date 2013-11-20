package is.ru.tictactoe;
import static org.junit.Assert.*;
import org.junit.Test;

public class PlayGameTest 
{	

	Player p1 = new Player(0, "Alice");
    Player p2 = new Player(1, "Bob");
	TicTacToe ticgame = new TicTacToe(p1,p2);
	PlayGame game = new PlayGame();
	@Test
    public void testPlayWin() 
    {
    	ticgame.gameBoard.addToBoard('X', 0);
		ticgame.gameBoard.addToBoard('X', 1);
    	assertEquals("F2XAlice won!", game.play(ticgame, 2));
    }
    @Test
    public void testPlaySwitch()
    {
    	assertEquals("P0XBob's move", game.play(ticgame, 0));
    }
    @Test
    public void testPlayDraw()
    {
    	ticgame.gameBoard.addToBoard('X', 0);
		ticgame.gameBoard.addToBoard('O', 1);
		ticgame.gameBoard.addToBoard('X', 2);
		ticgame.gameBoard.addToBoard('O', 3);
		ticgame.gameBoard.addToBoard('X', 4);
		ticgame.gameBoard.addToBoard('O', 5);
		ticgame.gameBoard.addToBoard('X', 7);
		ticgame.gameBoard.addToBoard('O', 6);
		ticgame.switchPlayer();
		assertEquals("F8OIt's a draw!", game.play(ticgame, 8));
    }
}