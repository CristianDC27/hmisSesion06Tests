package org.ual.hmis.equipo3;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class S6RegistroOkTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  // Browser selector
	   int browser= 1; // 0: firefox, 1: chrome,...
	   boolean headless = false;

	   switch (browser) {
	   case 0:  // firefox
		   // Firefox
		   // Descargar geckodriver de https://github.com/mozilla/geckodriver/releases
		   // Descomprimir el archivo geckodriver.exe en la carpeta drivers
		   System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
		   FirefoxOptions firefoxOptions = new FirefoxOptions();
		   if (headless) firefoxOptions.setHeadless(headless);
		   driver = new FirefoxDriver(firefoxOptions);

	   break;
	   case 1: // chrome
		   // Chrome
		   // Descargar Chromedriver de https://chromedriver.chromium.org/downloads
		   // Descomprimir el archivo chromedriver.exe en la carpeta drivers

		   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		   ChromeOptions chromeOptions = new ChromeOptions();
		   if (headless) chromeOptions.setHeadless(headless);
		   chromeOptions.addArguments("window-size=1920,1080");
		   driver = new ChromeDriver(chromeOptions);

		   break;

	   default:
		   	fail("Please select a browser");
		   	break;
	   }
	   js = (JavascriptExecutor) driver;
	   vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void s6RegistroOk() {
    // Test name: S6RegistroOk
    // Step # | name | target | value
    // 1 | open | https://hmis06.azurewebsites.net/ | 
    driver.get("https://hmis06.azurewebsites.net/");
    // 2 | setWindowSize | 945x1020 | 
    driver.manage().window().setSize(new Dimension(945, 1020));
    // 3 | click | linkText=Sign up | 
    driver.findElement(By.linkText("Sign up")).click();
    // 4 | waitForElementVisible | css=.ajax-button | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ajax-button")));
    }
    // 5 | executeScript | return "ual-" + Math.floor(Math.random()*1500000)+"@ual.es" | emailrandom
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    // 6 | type | id=full-name | ej1
    driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"ej1");
    // 7 | type | id=email-address | ${emailrandom}
    driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"),vars.get("emailrandom").toString());
    // 8 | type | id=password | ej1
    driver.findElement(By.id("password")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"ej1");
    // 9 | type | id=password | ej1
    driver.findElement(By.id("password")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"ej1");
    // 10 | type | id=confirm-password | ej1
    driver.findElement(By.id("confirm-password")).sendKeys(Keys.chord(Keys.CONTROL, "a"),"ej1");
    // 11 | click | id=terms-agreement | 
    driver.findElement(By.id("terms-agreement")).click();
    // 12 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 13 | waitForElementVisible | xpath=//div[@id='welcome']/div[2]/h1 | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'welcome\']/div[2]/h1")));
    }
    // 14 | assertText | css=p | This is a page that only logged-in people can visit. Don't you feel special? Try clicking on a button below to do some things you can't do when you're logged out.
    assertThat(driver.findElement(By.cssSelector("p")).getText(), is("This is a page that only logged-in people can visit. Don't you feel special? Try clicking on a button below to do some things you can't do when you're logged out."));
    // 15 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 16 | waitForElementVisible | linkText=Sign out | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
    }
    // 17 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
  }
}
