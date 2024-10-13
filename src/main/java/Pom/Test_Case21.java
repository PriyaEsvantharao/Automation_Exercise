package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case21 {

    WebDriver driver;

    public Test_Case21(WebDriver driver) {
        this.driver = driver;
    }

    public By ViewPdt = By.cssSelector("[href='/product_details/1']");
    public By Name = By.cssSelector("[placeholder='Your Name']");
    public By email = By.cssSelector("[placeholder='Email Address']");
    public By writeReview = By.cssSelector("[placeholder='Add Review Here!']");
    public By submitBtn = By.xpath("(//button[@type='submit'])[1]");

    public void clickViewPdt(){ driver.findElement(ViewPdt).click();}
    public void enterName(){ driver.findElement(Name).sendKeys("Priya");}
    public void enterEmail(){ driver.findElement(email).sendKeys("PriyaDinesh@gmail.com");}
    public void enterWriteReview(){driver.findElement(writeReview).sendKeys("bad");}
    public void clickSubmitBtn(){ driver.findElement(submitBtn).click();}
}
