package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case8 {

    WebDriver driver;

    public Test_Case8(WebDriver driver) {
        this.driver = driver;
    }

    public By pdtBtn = By.cssSelector("[href='/products']");
    public By firtViewPdtBtn = By.cssSelector("[href='/product_details/1']");


    public void clickPdtBtn() { driver.findElement(pdtBtn).click(); }
    public void clickFirstViewPdtBtn(){ driver.findElement(firtViewPdtBtn).click();}


}
