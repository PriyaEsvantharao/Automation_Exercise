package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case17 {

    WebDriver driver;

    public Test_Case17(WebDriver driver) {
        this.driver = driver;
    }

    public By xBtn = By.xpath("//table[@id='cart_info_table']/tbody/tr/td[6]/a");

    public void clickXBtn(){ driver.findElement(xBtn).click(); }
}
