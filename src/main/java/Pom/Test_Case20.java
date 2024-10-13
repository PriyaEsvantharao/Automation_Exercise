package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Case20 {

    WebDriver driver;

    public Test_Case20(WebDriver driver) {
        this.driver = driver;
    }
    public By cottonSaree = By.xpath("(//a[@data-product-id='39'])[1]");
    public By Email = By.xpath("//input[@data-qa='login-email']");
    public By PassWord = By.xpath("//input[@placeholder='Password']");
    public By LgnBtn = By.xpath("//button[normalize-space()='Login']");
    public By Cart = By.xpath("//a[normalize-space()='Cart']");


    public void clickCottonSaree(){ driver.findElement(cottonSaree).click();}
    public void EnterEmail(){driver.findElement(Email).sendKeys("PriyaDinesh@gmail.com");}
    public void EnterPassword(){driver.findElement(PassWord).sendKeys("Jennyworld");}
    public void ClickLgnBtn(){driver.findElement(LgnBtn).click();}
    public void ClickCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Cart)).click();}
}
