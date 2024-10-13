package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case4 {

    WebDriver driver;

    public Test_Case4(WebDriver driver) {
        this.driver = driver;
    }
//    TestCase-4
    public By mailAddr =By.xpath("//input[@data-qa='login-email']");
    public By passwd = By.xpath("//input[@data-qa='login-password']");
    public By logOutBtn = By.xpath("//a[normalize-space()='Logout']");

    public void enterMailAddress(){ driver.findElement(mailAddr).sendKeys("jennyrithish@gmail.com");}
    public void enterPasswd(){ driver.findElement(passwd).sendKeys("2206");}
    public void clickLogOutBtn(){driver.findElement(logOutBtn).click();}





}
