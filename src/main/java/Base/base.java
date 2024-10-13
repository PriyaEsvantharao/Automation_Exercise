package Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

    public static WebDriver driver;
    public void initializeBrowser() {
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
            driver.manage().window().maximize();
    }
    public void quitbrowser() { driver.quit(); }

}
