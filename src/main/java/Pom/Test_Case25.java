package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case25 {

    WebDriver driver;

    public Test_Case25(WebDriver driver) {
        this.driver = driver;
    }

    public By subMailAddress = By.cssSelector("[placeholder='Your email address']");
    public By arrowBtn = By.cssSelector("[class='btn btn-default']");

    public void enterSubMailAddress(){ driver.findElement(subMailAddress).sendKeys("PriyaDinesh@gmail.com");}
    public void clickArrowBtn(){ driver.findElement(arrowBtn).click();}
}
