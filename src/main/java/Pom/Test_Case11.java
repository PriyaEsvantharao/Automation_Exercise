package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case11 {

    WebDriver driver;

    public Test_Case11(WebDriver driver) {
        this.driver = driver;
    }

    public By cartBtn = By.xpath("(//a[@href='/view_cart'])[1]");

    public void clickCartBtn() { driver.findElement(cartBtn).click(); }


}