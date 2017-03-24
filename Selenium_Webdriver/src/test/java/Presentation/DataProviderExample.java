package Presentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by skavun on 3/22/2017.
 */

// Goal is to create one test method to combine several actions on one method

public class DataProviderExample {
    @Test(dataProvider = "credentialsData") // in annotation reuse data provider method

    public void TestInvalidCredentials(String login, String password, String expectedMessage) {
        WebDriver driver = new ChromeDriver();

        //Find element for login and fill it with Login variable
        WebElement LoginFiled =driver.findElement(By.cssSelector("#user"));
        LoginFiled.sendKeys("login");

        //Find element for password and fill it with password variable
        WebElement PasswordFiled =driver.findElement(By.cssSelector("#password"));
        LoginFiled.sendKeys("password");

        //Click login button
        WebElement loginButton =driver.findElement(By.cssSelector("#login"));
        loginButton.click();

        // to verify error ExpectedMessage variable
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#error. error-message"), expectedMessage));

    }

    //data provider method
    @DataProvider
    public Object[][] credentialsData() {
        return new Object[][]{
                {"someincorrectlogin@gmail.com", "correctpass", "There is no such login"}
                {"correctlogin@gmail.com", "inccorectpass", "Invaid password"}
        }
    }

}
