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
import org.openqa.selenium.firefox.FirefoxProfile;
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
public class S6CambioContrasenaFailsTest {
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
//		   System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
		   FirefoxOptions firefoxOptions = new FirefoxOptions();
		   FirefoxProfile firefoxProfile = new FirefoxProfile();
		   firefoxProfile.setPreference("intl.accept_languages", "es-ES");
		   firefoxOptions.setProfile(firefoxProfile);
		   if (headless) firefoxOptions.setHeadless(headless);
		   driver = new FirefoxDriver(firefoxOptions);

	   break;
	   case 1: // chrome
		   // Chrome
		   // Descargar Chromedriver de https://chromedriver.chromium.org/downloads
		   // Descomprimir el archivo chromedriver.exe en la carpeta drivers

//		   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		   ChromeOptions chromeOptions = new ChromeOptions();
		   chromeOptions.addArguments("--lang= es");
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
  public void s6CambioContrasenaFails() {
    // Test name: S6CambioContrasenaFails
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
    // 5 | type | css=.form-group:nth-child(1) > .form-control | ej1@ual.es
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("ej1@ual.es");
    // 6 | type | css=.form-group:nth-child(2) > .form-control | ej1
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("ej1");
    // 7 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 8 | waitForElementVisible | xpath=//div[@id='welcome']/div[2]/h1 | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\'welcome\']/div[2]/h1")));
    }
    // 9 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 10 | waitForElementVisible | linkText=Settings | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Settings")));
    }
    // 11 | click | linkText=Settings | 
    driver.findElement(By.linkText("Settings")).click();
    // 12 | waitForElementVisible | linkText=Change password | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Change password")));
    }
    // 13 | click | linkText=Change password | 
    driver.findElement(By.linkText("Change password")).click();
    // 14 | waitForElementVisible | css=.button-text | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button-text")));
    }
    // 15 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 16 | assertText | css=.col-sm-6:nth-child(1) .invalid-feedback | Please enter a password or choose "Cancel".
    assertThat(driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) .invalid-feedback")).getText(), is("Please enter a password or choose \"Cancel\"."));
    // 17 | assertText | css=.col-sm-6:nth-child(2) .invalid-feedback | Your new password and confirmation do not match.
    assertThat(driver.findElement(By.cssSelector(".col-sm-6:nth-child(2) .invalid-feedback")).getText(), is("Your new password and confirmation do not match."));
    // 18 | type | id=password | ej1
    driver.findElement(By.id("password")).sendKeys("ej1");
    // 19 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 20 | assertText | css=.invalid-feedback | Your new password and confirmation do not match.
    assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(), is("Your new password and confirmation do not match."));
    // 21 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 22 | waitForElementVisible | linkText=Sign out | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
    }
    // 23 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
  }
}
