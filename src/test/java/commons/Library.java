package commons;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class Library extends Base {

    String CHROME_DRIVER = "webdriver.chrome.driver";
    String CHROME_DRIVER_PATH = "C:\\Users\\minch\\IdeaProjects\\ZwiftProject\\src\\test\\java\\drivers\\chromedriver.exe";

    public Library(WebDriver _driver) {
        driver = _driver;
    }

    public WebDriver openBrowser() {
        System.setProperty(CHROME_DRIVER, CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public static WebElement waitForElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.elementToBeClickable(by));

    }
}
