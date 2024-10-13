package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case16 {

    WebDriver driver;

    public Test_Case16(WebDriver driver) {
        this.driver = driver;
    }

    public By mailAddr =By.xpath("//input[@data-qa='login-email']");
    public By passwd = By.xpath("//input[@data-qa='login-password']");
    public By logBtn = By.xpath("//button[@data-qa='login-button']");

    public void enterMailAddress(){ driver.findElement(mailAddr).sendKeys("PriyaDinesh@gmail.com");}
    public void enterPasswd(){ driver.findElement(passwd).sendKeys("Jennyworld");}
    public void clickLogInBtn(){driver.findElement(logBtn).click();}

}
