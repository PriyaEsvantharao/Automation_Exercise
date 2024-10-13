package Pom;

import org.openqa.selenium.*;

public class Test_Case6 {

    WebDriver driver;

    public Test_Case6(WebDriver driver) {
        this.driver = driver;
    }
//TestCase-6
    public By contactUsBtn = By.xpath("//a[@href='/contact_us']");
    public By ContName =By.cssSelector("[data-qa='name']");
    public By ContMail =By.cssSelector("[placeholder='Email']");
    public By subject =By.cssSelector("[data-qa='subject']");
    public By msg =By.cssSelector("[placeholder='Your Message Here']");
    public By chooseFileBtn = By.name("upload_file");
    public By submitBtn =By.xpath("//input[@name='submit']");
    public By homeBtn =By.cssSelector("[class='btn btn-success']");


    public void clickContactUsBtn(){driver.findElement(contactUsBtn).click();}
    public void enterContactName() { driver.findElement(ContName).sendKeys("Priya");}
    public void enterContMail () {driver.findElement(ContMail).sendKeys("jennyrithish@gmail.com");}
    public void enterSubject() { driver.findElement(subject).sendKeys("Automation Testing");}
    public void enterMsg(){ driver.findElement(msg).sendKeys("Automated by TestCase as practice");}
    public void clickChooseFileUpload(){
        WebElement upload = driver.findElement(chooseFileBtn);
        String filepath = "C:\\Users\\LENOVO\\Documents\\Automation Excercise.pdf";
        upload.sendKeys(filepath);
    }
    public void clickSubmitBtn(){ driver.findElement(submitBtn).click();}
    public void clickokBtn(){
        try {
            // Switch to the alert if it's present
            Alert alert = driver.switchTo().alert();
            // Print the alert text to the console
            System.out.println("Alert message: " + alert.getText());
            // Accept the alert (click the OK button)
            alert.accept();
            System.out.println("Alert accepted successfully.");
        } catch (NoAlertPresentException e) {
            System.out.println("No alert found, proceeding with the next steps.");
        }
    }
    public void clickHomeBtn(){ driver.findElement(homeBtn).click();}


}
