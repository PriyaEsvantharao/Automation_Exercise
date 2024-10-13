package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case9 {

    WebDriver driver;

    public Test_Case9(WebDriver driver) {
        this.driver = driver;
    }

    public By srchInput = By.cssSelector("[placeholder='Search Product']");
    public By srchBtn = By.cssSelector("[class='btn btn-default btn-lg']");


    public void enterSrchInputBtn(){ driver.findElement(srchInput).sendKeys("saree");}
    public void clickSrchBtn(){ driver.findElement(srchBtn).click(); }

}
