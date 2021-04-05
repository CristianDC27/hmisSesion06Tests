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
public class S6LogInFailsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	// Browser selector
	   int browser= 0; // 0: firefox, 1: chrome,...
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
  public void s6LogInFails() {
    // Test name: S6LogInFails
    // Step # | name | target | value
    // 1 | open | https://hmis06.azurewebsites.net/ | 
    driver.get("https://hmis06.azurewebsites.net/");
    // 2 | setWindowSize | 945x1020 | 
    driver.manage().window().setSize(new Dimension(945, 1020));
    // 3 | waitForElementVisible | linkText=Log in | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log in")));
    }
    // 4 | click | linkText=Log in | 
    driver.findElement(By.linkText("Log in")).click();
    // 5 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 6 | assertText | css=.form-group:nth-child(1) > .invalid-feedback | Please provide a valid email address.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(1) > .invalid-feedback")).getText(), is("Please provide a valid email address."));
    // 7 | assertText | css=.form-group:nth-child(2) > .invalid-feedback | Please enter your password.
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(2) > .invalid-feedback")).getText(), is("Please enter your password."));
    // 8 | type | css=.form-group:nth-child(1) > .form-control | ej1@ual.es
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("ej1@ual.es");
    // 9 | type | css=.form-group:nth-child(2) > .form-control | ej2
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("ej2");
    // 10 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 11 | waitForElementVisible | css=.text-danger | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-danger")));
    }
    // 12 | assertText | css=.text-danger | The credentials you entered are not associated with an account. Please check your email and/or password and try again.
    assertThat(driver.findElement(By.cssSelector(".text-danger")).getText(), is("The credentials you entered are not associated with an account. Please check your email and/or password and try again."));
  }
}
