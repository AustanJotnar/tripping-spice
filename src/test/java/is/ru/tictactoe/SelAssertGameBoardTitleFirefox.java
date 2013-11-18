//package is.ru.tictactoe;

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

public class SelAssertGameBoardTitleFirefox {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://ajtictac.herokuapp.com/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testSelAssertGameBoardTitleFirefox() throws Exception {
		selenium.open("/");
		assertEquals("TicTacToe", selenium.getTitle());
		assertTrue(selenium.isElementPresent("id=gameboard"));
		//selenium.sendKeys("id=player0", "Johannes");
		//selenium.sendKeys("id=player1", "Fannar");
		assertTrue(selenium.isElementPresent("css=button.btn.btn-default"));
		selenium.clickAt("css=button.btn.btn-default", "");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
