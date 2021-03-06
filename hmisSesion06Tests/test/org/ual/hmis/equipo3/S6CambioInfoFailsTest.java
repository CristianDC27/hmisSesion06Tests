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
public class S6CambioInfoFailsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  private int browser;
  @Before
  public void setUp() {
	// Browser selector
	   browser= 0; // 0: firefox, 1: chrome,...
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
  public void s6CambioInfoFails() {
    // Test name: S6CambioInfoFails
    // Step # | name | target | value
	  vars.put("navigatorLanguage", js.executeScript("return navigator.language"));
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
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button-text")));
     }
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
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button-text")));
      }
    // 14 | type | id=full-name | ej1
    driver.findElement(By.id("full-name")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.id("full-name")).sendKeys("ej1");
    // 15 | type | id=email-address | ej1
    driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.id("email-address")).sendKeys("ej1");
    
    driver.findElement(By.cssSelector(".button-text")).click();
    // 16 | executeScript | return document.getElementById("email-address").validationMessage | message
    vars.put("message", js.executeScript("return document.getElementById(\"email-address\").validationMessage"));
    // 17 | assert | message | Incluye un signo "@" en la direcci??n de correo electr??nico. La direcci??n "ej1" no incluye el signo "@".
    if(browser==1)
    	assertEquals(vars.get("message").toString(), "Incluye un signo \"@\" en la direcci??n de correo electr??nico. La direcci??n \"ej1\" no incluye el signo \"@\".");
    else {
    	assertEquals(vars.get("message").toString(), "Please enter an email address.");
//    	  if ((Boolean) js.executeScript("return (arguments[0].includes(\'es\'))", vars.get("navigatorLanguage"))) 
//    		  assertEquals(vars.get("message").toString(), "Introduzca una direcci??n de correo.");
//    	  else
//    		  assertEquals(vars.get("message").toString(), "Please enter an email address.");
    }
    // 18 | type | id=email-address | ej1@
    driver.findElement(By.id("email-address")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
    driver.findElement(By.id("email-address")).sendKeys("ej1@");
    // 19 | click | css=.button-text | 
    driver.findElement(By.cssSelector(".button-text")).click();
    // 20 | executeScript | return document.getElementById("email-address").validationMessage | message
    vars.put("message", js.executeScript("return document.getElementById(\"email-address\").validationMessage"));
    // 21 | assert | message | Introduce texto detr??s del signo "@". La direcci??n "ej1@" est?? incompleta.
    if(browser==1)
    	assertEquals(vars.get("message").toString(), "Incluye un signo \"@\" en la direcci??n de correo electr??nico. La direcci??n \"ej1\" no incluye el signo \"@\".");
    else {
    	assertEquals(vars.get("message").toString(), "Please enter an email address.");
//    	  if ((Boolean) js.executeScript("return (arguments[0].includes(\'es\'))", vars.get("navigatorLanguage"))) 
//    		  assertEquals(vars.get("message").toString(), "Introduzca una direcci??n de correo.");
//    	  else
//    		  assertEquals(vars.get("message").toString(), "Please enter an email address.");
    }
    // 22 | click | id=header-account-menu-link | 
    driver.findElement(By.id("header-account-menu-link")).click();
    // 23 | waitForElementVisible | linkText=Sign out | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, 30);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
    }
    // 24 | click | linkText=Sign out | 
    driver.findElement(By.linkText("Sign out")).click();
  }
}
