package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Case22 {

    WebDriver driver;

    public Test_Case22(WebDriver driver) {
        this.driver = driver;
    }
    public By recommendedPdt = By.xpath("//div[@class='recommended_items']//following::a[@data-product-id='4']");
    public By viewCartBtn = By.xpath("//div[@class='modal-content']//following::a[@href='/view_cart']");

    public void clickRecommendedPdt(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = driver.findElement(recommendedPdt);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='recommended_items']//following::a[@data-product-id='4']")));
        element.click();
    }
    public void clickViewCartBtn(){ driver.findElement(viewCartBtn).click();}

}
