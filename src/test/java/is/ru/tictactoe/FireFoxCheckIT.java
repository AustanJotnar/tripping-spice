package is.ru.tictactoe;

import com.thoughtworks.selenium.Selenium;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import static org.apache.commons.lang3.StringUtils.join;
import static org.junit.Assert.*;

public class FireFoxCheckIT {
	private Selenium selenium;
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		String baseUrl = System.getenv("STAGING_SERVER");
		driver = new FirefoxDriver();
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testFireFoxTestTitleIT() throws Exception {
		selenium.open("/");
		selenium.waitForPageToLoad("30000");
		assertEquals("TicTacToe", selenium.getTitle());
	}


//	@Test
//	public void testFireFoxCheckForWinnerAndDrawIT() throws Exception {
//		selenium.open("/");
//		selenium.waitForPageToLoad("30000");
//		selenium.type("id=player0", "Simon");
//		selenium.type("id=player1", "Bob");
//		selenium.click("css=button.btn.btn-default");
//		selenium.click("id=cell2");
//		selenium.click("id=cell0");
//		selenium.click("id=cell1");
//		selenium.click("id=cell3");
//		selenium.click("id=cell8");
//		selenium.click("id=cell6");
//		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".overlay")));
//		assertEquals("Bob won!", selenium.getText("id=messages"));
//		/*driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		assertEquals("Bob won!", selenium.getText("id=messages"));*/
//		selenium.click("css=button.btn.btn-default");
//		selenium.click("id=cell3");
//		selenium.click("id=cell1");
//		selenium.click("id=cell0");
//		selenium.click("id=cell6");
//		selenium.click("id=cell4");
//		selenium.click("id=cell5");
//		selenium.click("id=cell7");
//		selenium.click("id=cell8");
//		selenium.click("id=cell2");
//		myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".overlay")));
//		assertEquals("It's a draw!", selenium.getText("id=messages"));
//		/*driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		assertEquals("It's a draw!", selenium.getText("id=messages"));*/
//	}

	

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
