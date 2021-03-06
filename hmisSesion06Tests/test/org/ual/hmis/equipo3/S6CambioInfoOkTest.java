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
public class S6CambioInfoOkTest {
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
  public void s6CambioInfoOk() {
    // Test name: S6CambioInfoOk
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
    // 12 | waitForElementVisible | linkText=Edit profile | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Edit profile")));
    }
    // 13 | click | linkText=Edit profile | 
    driver.findElement(By.linkText("Edit profile")).click();
    // 14 | type | id=full-name | ej2
    driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.id("full-name")).sendKeys("ej2");
    // 15 | type | id=email-address | ej2@ual.es
    driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.id("email-address")).sendKeys("ej2@ual.es");
    // 16 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    // 17 | waitForElementVisible | linkText=Edit profile | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Edit profile")));
    }
    // 18 | assertText | css=.row:nth-child(4) strong | ej2
    assertThat(driver.findElement(By.cssSelector(".row:nth-child(4) strong")).getText(), is("ej2"));
    // 19 | assertText | css=.row:nth-child(5) strong | ej2@ual.es
    assertThat(driver.findElement(By.cssSelector(".row:nth-child(5) strong")).getText(), is("ej2@ual.es"));
    // 20 | click | linkText=Edit profile | 
    driver.findElement(By.linkText("Edit profile")).click();
    // 21 | type | id=full-name | ej1
    driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.id("full-name")).sendKeys("ej1");
    // 22 | type | id=email-address | ej1@ual.es
    driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.id("email-address")).sendKeys("ej1@ual.es");
    // 23 | click | css=.ajax-button | 
    driver.findElement(By.cssSelector(".ajax-button")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Edit profile")));
      }
    // 24 | assertText | css=.row:nth-child(4) strong | ej1
    assertThat(driver.findElement(By.cssSelector(".row:nth-child(4) strong")).getText(), is("ej1"));
    // 25 | assertText | css=.row:nth-child(5) strong | ej1@ual.es
    assertThat(driver.findElement(By.cssSelector(".row:nth-child(5) strong")).getText(), is("ej1@ual.es"));
    // 26 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 27 | waitForElementVisible | linkText=Sign out | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
    }
    // 28 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
  }
}
