package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case18 {

    WebDriver driver;

    public Test_Case18(WebDriver driver) {
        this.driver = driver;
    }

    public By women = By.cssSelector("[href='#Women']");
    public By tops = By.xpath("//div[@class='panel-body']//following::a[@href='/category_products/2']");
    public By men  = By.cssSelector("[href='#Men']");
    public By tShirt = By.cssSelector("[href='/category_products/3']");

    public void clickWomen(){ driver.findElement(women).click();}
    public void clickTops(){ driver.findElement(tops).click();}
    public void clickMen(){ driver.findElement(men).click();}
    public void clickTShirt(){ driver.findElement(tShirt).click();}


}
