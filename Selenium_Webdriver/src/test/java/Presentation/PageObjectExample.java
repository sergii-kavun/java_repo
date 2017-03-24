package Presentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 * Created by skavun on 3/22/2017.
 */

// this class is created to keep all preconditions and post conditions
// separate classes will be created to handle separate pages

public class PageObjectExample {
    //logic for creation driver should be here
    protected WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
    }




}
