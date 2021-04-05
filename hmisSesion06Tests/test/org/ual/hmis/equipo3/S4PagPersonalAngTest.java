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
public class S4PagPersonalAngTest {
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
  public void s4PagPersonalAng() {
    // Test name: S4_PagPersonalAng
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://hmis20-cc002.azurewebsites.net/");
    // 2 | setWindowSize | 974x1040 | 
    driver.manage().window().setSize(new Dimension(974, 1040));
    // 3 | click | css=.fa-caret-down | 
    driver.findElement(By.cssSelector(".fa-caret-down")).click();
    // 4 | click | linkText=Ángel Gómez Espinosa | 
    driver.findElement(By.linkText("Ángel Gómez Espinosa")).click();
    {
  	  WebDriverWait wait = new WebDriverWait(driver, 30);
  	  wait.until(ExpectedConditions.textToBe(By.cssSelector(".tm-hero-title"), "Página Personal"));
   }
    // 5 | assertTitle | Ángel Gómez Espinosa | 
    assertThat(driver.getTitle(), is("Ángel Gómez Espinosa"));
    // 6 | assertText | css=.tm-hero-subtitle | Ángel Gómez Espinosa\nResponsable
    assertThat(driver.findElement(By.cssSelector(".tm-hero-subtitle")).getText(), is("Ángel Gómez Espinosa\nResponsable"));
    // 7 | click | css=.fa-caret-down | 
    driver.findElement(By.cssSelector(".fa-caret-down")).click();
    // 8 | assertElementPresent | css=.tm-intro-img | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".tm-intro-img"));
      assert(elements.size() > 0);
    }
    // 9 | assertText | css=.mb-4:nth-child(2) | !Hola!, me presento soy Ángel Gómez, estudiante de la Universidad de Almería, cursando actualmente la carrera de Ingeniería informática, con mención en ingenería del software.
    assertThat(driver.findElement(By.cssSelector(".mb-4:nth-child(2)")).getText(), is("!Hola!, me presento soy Ángel Gómez, estudiante de la Universidad de Almería, cursando actualmente la carrera de Ingeniería informática, con mención en ingenería del software."));
    // 10 | assertElementPresent | css=#slick-slide00 i | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#slick-slide00 i"));
      assert(elements.size() > 0);
    }
    // 11 | assertElementPresent | css=#slick-slide01 i | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#slick-slide01 i"));
      assert(elements.size() > 0);
    }
    // 12 | assertElementPresent | css=#slick-slide02 span | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#slick-slide02 span"));
      assert(elements.size() > 0);
    }
    // 13 | click | id=slick-slide-control02 | 
    driver.findElement(By.id("slick-slide-control02")).click();
    // 14 | assertElementPresent | css=#slick-slide04 h2 | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#slick-slide04 h2"));
      assert(elements.size() > 0);
    }
    // 15 | assertElementPresent | css=#slick-slide05 span | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#slick-slide05 span"));
      assert(elements.size() > 0);
    }
    // 16 | assertElementPresent | css=#slick-slide06 h2 | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#slick-slide06 h2"));
      assert(elements.size() > 0);
    }
    // 17 | click | id=slick-slide-control03 | 
    driver.findElement(By.id("slick-slide-control03")).click();
    // 18 | mouseDown | css=#slick-slide07 span | 
    {
      WebElement element = driver.findElement(By.cssSelector("#slick-slide07 span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 19 | mouseUp | css=#slick-slide07 h2 | 
    {
      WebElement element = driver.findElement(By.cssSelector("#slick-slide07 h2"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 20 | assertElementPresent | css=#slick-slide07 h2 | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#slick-slide07 h2"));
      assert(elements.size() > 0);
    }
    // 21 | assertElementPresent | css=.mb-0 | 
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".mb-0"));
      assert(elements.size() > 0);
    }
  }
}