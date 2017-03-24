package Presentation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by skavun on 3/20/2017.
 */
public class LoginTest extends PageObjectExample {
    @Test // some annotation

    public void TestSuccessfulLogin() {
        // This is optional if we don`t specify chrome driver path in env variables
        // System.setProperty("webdriver.chrome.driver", "src/main/resources/browser/chromedriver.exe");

        WebDriver driverCr = new ChromeDriver();
            driverCr.quit();

        driverCr.get("google.com");
        WebElement el1 = driverCr.findElement(By.cssSelector("#tag_id")); // find login filed
        el1.sendKeys("sometext"); // to send some text to desire element


        WebElement pass1 = driverCr.findElement(By.cssSelector("#tag_id")); // find passfield
        pass1.sendKeys("password"); // send values to password fileds

        WebElement loginButton = driverCr.findElement(By.cssSelector("#tag_id"));
        loginButton.click(); // click button

        //Refresh page
        //After page is refreshed new elements created and  we need to find the, AGAIN !
        driverCr.navigate().refresh();

        ArrayList <WebElement> buttonList = driverCr.findElement(By.cssSelector(".tag_class"));
        Assert.assertTrue(buttonList.size()>0);

        String someText = buttonList.findElement(By.cssSelector("span")).getText();
        Assert.assertEquals(someText, "Text to check whether present");



        //------------------------ Information---------------

        //Operate browser

        // driver.quite();  -- close all wodniws and exot
        // driver.close();  -- close current window;

        //Page open and wait until its loaded
        driverCr.get ("URL");

        // Navigation
        driverCr.navigate().refresh(); // refresh
                driverCr.navigate().back();

        //Find elements
        WebElement element = driverCr.findElement(byLocator); // only first elemnt in the DOM


        List <WebElement> elements = driverCr.findElements(byLocator);  // will find ALL elemnts in page

        //Locator types
        //By.id;
        //By.name;
        //By.CssSelector;
        //By.TagName;
        //By.xpath;

        List <WebElement> buttonList = driverCr.findElement(By.cssSelector(".tag_class"));
        String someText = buttonList.findElement(By.cssSelector("span")).getText();


        // TO make assertions or verifications
        Assert.assertEquals(someText, "Text to check whether present");

        //CHeck that some element is present
        String someText = buttonList.findElement(By.cssSelector("span")).getText();
        Assert.assertEquals(someText, "Text to check whether present");


        // We could use several FindElemnts methods to find childs of found element

        //If nothing is found Find element returns NoSuchElementExepction

        // FindElements return empty list in case nothing is find

        // TO check some element present on page

        // first way
        boolean isElementPresent(By.ByCssSelector) {
            WebDriver driver = new ChromeDriver();

        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

        //second way
        boolean isElementPresent(By.ByCssSelector) {
            WebDriver driver2 = new ChromeDriver();
            return driver2.

        }

    WebDriver driver3 = new ChromeDriver();

    // Wait methods for element to appear on the page
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    // Explicit way is not only for FindElements method and might be used everywhere
    WebDriver wait = new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.ByCssSelector(".mod-add"));

    List<WebElement> elementsList = driver3.findElements(By.cssSelector("input"));

    //Actions
    /*
    Click
    SendKeys
    MoveToElement
    ClickAndHold
    Release
    KeyDown / UP
    ....
     */


    Actions act1 = new Actions(driver3);
     new Actions(driver).moveToElement(el, 1,1)
        .click();
        .perform();


    // geText() , getAttribute() ,
    input.getAttribute("href");

    // Elements

    element.getSize();
    element.getLocation();

    // Swith TO

    driver.switchTo().window(); // this means switch tabs of browser
    driver.switchTo().frame();
    String text = driver.switchTo().alert().getText();

    // Browsers windows
    driver.getWindowHandles(); // return all links to all opened tabs
    driver.switchTo().window(handle); // to open some tab passign window handle link received from previous command

    // window size and position
    driver.manage().window().getSize();
    driver.manage().window().setSize(new Dimension(800, 600));
    driver.manage().window().fullScreen();


    //Delete cookies
    // prior to this ou have to get page and log into it
    driver.manage().deleteCookieNamed("PHPSESSID");

    //Set Coockies
    // need to log into
    authCookie = driver.manage().getCookieNamed("PHPSESSID");
    WebDriver driver2 = new FirefoxDriver();

    driver2.manage().setCookieNamed();




        }
  }
}

// test ng Annotations

// Its worth to have create separate class where all setups (like create driver instance, quit browser and so on) done
// and then to reuse it within testing m

// Its worth to create reusable methods for every function in application and just onvoke them in test methods

// Its worth to test not only UI and API as well,  in different tests

// Its worth to separate test data from test methods
// Its worth to have page object model for all objects exist in application

//ITS WORTH TO SEPARATE LOGIC OF PAGES from test methods

//Main Paterns for automated tests

//1. DomainDrivenDesign : use names in your tests that are used in domain area you are working on
//2. PageObjects: abstraction of web UI
//3. LoadableComponent: Modeling PageObjects as components;