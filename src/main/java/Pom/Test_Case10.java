package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case10 {

    WebDriver driver;

    public Test_Case10(WebDriver driver) {
        this.driver = driver;
    }
    public By subMailAddress = By.cssSelector("[placeholder='Your email address']");
    public By arrowBtn = By.cssSelector("[class='btn btn-default']");

    public void entersubmailAddress(){ driver.findElement(subMailAddress).sendKeys("jennyrithish@gmail.com");}
    public void clickArrowBtn(){ driver.findElement(arrowBtn).click();}

}
