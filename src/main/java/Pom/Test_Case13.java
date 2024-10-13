package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Case13 {

    WebDriver driver;

    public Test_Case13(WebDriver driver) {
        this.driver = driver;
    }

    public By pdt = By.xpath("//a[@href='/product_details/22']");
    public By addQtyBtn = By.xpath("//input[@name='quantity']");
    public By viewCartBtn = By.xpath("//u[text()='View Cart']");

    public void clickViewPdtBtn(){ driver.findElement(pdt).click();}
    public void enterQty(){
        driver.findElement(addQtyBtn).clear();
        driver.findElement(addQtyBtn).sendKeys("4");
    }
    public void clickCartBtn(){
        WebElement cartButton = driver.findElement(By.xpath("//button[@class='btn btn-default cart']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cartButton);
        cartButton.click();}
    public void clickViewCartBtn(){ driver.findElement(viewCartBtn).click();}

}
