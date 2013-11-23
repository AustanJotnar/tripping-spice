package is.ru.tictactoe;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class FireFoxCheckIT {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = System.getenv("STAGING_SERVER");
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testFireFoxTestTitleIT() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("30000");
		assertEquals("TicTacToe", selenium.getTitle());
	}

	@Test
	public void testFireFoxCheckForWinnerIT() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=player0", "Simon");
		selenium.type("id=player1", "Bob");
		selenium.click("css=button.btn.btn-default");
		selenium.click("id=cell3");
		selenium.click("id=cell1");
		selenium.click("id=cell0");
		selenium.click("id=cell4");
		selenium.click("id=cell6");
		assertEquals("Simon won!", selenium.getText("id=messages"));
	}

	@Test
	public void testFireFoxCheckForWinnerAndDrawIT() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=player0", "Simon");
		selenium.type("id=player1", "Bob");
		selenium.click("css=button.btn.btn-default");
		selenium.click("id=cell2");
		selenium.click("id=cell0");
		selenium.click("id=cell1");
		selenium.click("id=cell3");
		selenium.click("id=cell8");
		selenium.click("id=cell6");
		String winmessages = "Finished\nBob won!\nClick \"Restart Game\" to play again.";
		assertEquals(winmessages, selenium.getText("class=overlay"));
		selenium.click("css=button.btn.btn-default");
		selenium.click("id=cell3");
		selenium.click("id=cell1");
		selenium.click("id=cell0");
		selenium.click("id=cell6");
		selenium.click("id=cell4");
		selenium.click("id=cell5");
		selenium.click("id=cell7");
		selenium.click("id=cell8");
		selenium.click("id=cell2");
		String drawmessages = "Finished\nIt's a draw!\nClick \"Restart Game\" to play again.";
		assertEquals(drawmessages, selenium.getText("class=overlay"));
	}

	

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
