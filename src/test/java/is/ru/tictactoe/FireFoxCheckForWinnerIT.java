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

public class FireFoxCheckForWinnerIT {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = System.getenv("http://ajtictac-staging.herokuapp.com/");
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
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
		//assertEquals("Simon won!", selenium.getText("id=test"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
