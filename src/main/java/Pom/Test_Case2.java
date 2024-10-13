package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case2 {

    WebDriver driver;

    public Test_Case2(WebDriver driver) {
        this.driver = driver;
    }

    //TestCase-2
    public By mailAddr =By.xpath("//input[@data-qa='login-email']");
    public By passwd = By.xpath("//input[@data-qa='login-password']");
    public By logBtn = By.xpath("//button[@data-qa='login-button']");


    public void enterMailAddress(){ driver.findElement(mailAddr).sendKeys("jennyrithish@gmail.com");}
    public void enterPasswd(){ driver.findElement(passwd).sendKeys("2206");}
    public void clickLogInBtn(){driver.findElement(logBtn).click();}

    //TestCase-3
    public void enterMailAddress1(){ driver.findElement(mailAddr).sendKeys("priyajenny@gmail.com");}


}
