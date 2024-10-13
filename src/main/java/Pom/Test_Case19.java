package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case19 {

    WebDriver driver;

    public Test_Case19(WebDriver driver) {
        this.driver = driver;
    }

    public By babyHug = By.cssSelector("[href='/brand_products/Babyhug']");
    public By allen = By.cssSelector("[href='/brand_products/Polo']");

    public void clickBabyHug(){ driver.findElement(babyHug).click();}
    public void clickAllen(){ driver.findElement(allen).click();}

}
