package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test_Case12 {

    WebDriver driver;

    public Test_Case12(WebDriver driver) {
        this.driver = driver;
    }
    public By firstPdt = By.xpath("(//div[@class='productinfo text-center'])[1]");
    public By secondPdt = By.xpath("(//div[@class='productinfo text-center'])[2]");
    public By viewCartBtn = By.xpath("//u[text()='View Cart']");

   public void clickFirstPdt() {
       WebElement firstPdtElement = driver.findElement(firstPdt);
       Actions actions = new Actions(driver);
       actions.moveToElement(firstPdtElement).click(firstPdtElement).build().perform();
   }
   public void clickFCartBtn(){
       WebElement firstCart = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[2]"));
       firstCart.click();
   }
   public void clickContBtn(){
       WebElement continueShoppingButton = driver.findElement(By.xpath("//div[@class='modal-content']//div[@class='modal-footer']//button[@class='btn btn-success close-modal btn-block']"));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueShoppingButton);
       continueShoppingButton.click();
   }
   public void clickSecondPdt(){
       WebElement secondPdtElement = driver.findElement(secondPdt);
       Actions actions = new Actions(driver);
       actions.moveToElement(secondPdtElement).click(secondPdtElement).build().perform();
   }
    public void clickSCartBtn(){
        WebElement secondCart = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[4]"));
        secondCart.click();
    }
    public void clickViewCartBtn(){ driver.findElement(viewCartBtn).click();}

}
