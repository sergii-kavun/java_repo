package NewTestPackage;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by vid4i on 21.03.2017.
 */
public class FirstTest {
    @Test
    public void SuccessfulLogin () {
        // Specify setProperty. Its optionally if env variable path is not updated
        //System.setProperty("webdriver.chrome.driver","D:/Learning/Automation/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("Siski");
        //searchBox.submit();

        WebElement searchButton = driver.findElement(By.cssSelector("svg[viewbox='0 0 24 24']"));
        searchButton.click();

        // check whether some text is at the page
        driver.getPageSource().contains("Голос");
        Assert.assertTrue(driver.getPageSource().contains("YouTube"));

        driver.quit();

    }


}
