package base;
import commons.Library;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

    public static WebDriver driver;
    public static Library Lib;


    @BeforeTest
    public void setupBrowser(){
    Lib = new Library(driver);
    driver = Lib.openBrowser();
    driver.get("https://zwift.com");
    }

    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}
