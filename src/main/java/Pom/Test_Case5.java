package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case5 {

    WebDriver driver;

    public Test_Case5(WebDriver driver) {
        this.driver = driver;
    }

//testCase-5

    public By name = By.cssSelector("[placeholder='Name']");
    public By Email = By.xpath("(//input[@placeholder='Email Address'])[2]");
    public By signBtn = By.xpath("//button[normalize-space()='Signup']");

    public void enterName(){ driver.findElement(name).sendKeys("priya");}
    public void entermail(){ driver.findElement(Email).sendKeys("jennyrithish@gmail.com");}
    public void clickSignBtn(){ driver.findElement(signBtn).click();}

}
