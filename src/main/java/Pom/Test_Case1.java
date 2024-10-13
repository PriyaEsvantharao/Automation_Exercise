package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case1 {

    WebDriver driver;

    public Test_Case1(WebDriver driver) {
        this.driver = driver;
    }
// Testcase-1
    public By SignUpBtn = By.xpath("//a[normalize-space()='Signup / Login']");
    public By name = By.cssSelector("[placeholder='Name']");
    public By EmailAddress = By.xpath("(//input[@placeholder='Email Address'])[2]");
    public By signBtn = By.xpath("//button[normalize-space()='Signup']");
    public By title =By.cssSelector("[value='Mrs']");
    public By pass=By.cssSelector("[data-qa='password']");
    public By day = By.cssSelector("[data-qa='days']");
    public By month = By.cssSelector("[data-qa='months']");
    public By yrs = By.cssSelector("[data-qa='years']");
    public By newsLettercheckBox=By.id("newsletter");
    public By specialOfferCheckBox = By.id("optin");
    public By fName=By.cssSelector("[data-qa='first_name']");
    public By lName =By.cssSelector("[name='last_name']");
    public By comp= By.cssSelector("[name='company']");
    public By Addr1=By.cssSelector("[name='address1']");
    public By Addr2=By.cssSelector("[name='address2']");
    public By state= By.cssSelector("[name='state']");
    public By city = By.cssSelector("[name='city']");
    public By zipcode=By.cssSelector("[name='zipcode']");
    public By mobileNum= By.cssSelector("[name='mobile_number']");
    public By createAcctBtn =By.cssSelector("[data-qa='create-account']");
    public By continueBtn = By.cssSelector("[data-qa='continue-button']");
    public By deleteBtn =By.xpath("//a[@href='/delete_account']");
    public By DelContinueBtn = By.xpath("//a[@data-qa='continue-button']");


    public void clickSignupBtn(){ driver.findElement(SignUpBtn).click(); }
    public void enterName(){ driver.findElement(name).sendKeys("priya");}
    public void enterEmailAdd(){ driver.findElement(EmailAddress).sendKeys("PriyaDinesh@gmail.com");}
    public void clickSignBtn(){ driver.findElement(signBtn).click();}
    public void clickTitle(){ driver.findElement(title).click();}
    public void enterPass(){ driver.findElement(pass).sendKeys("Jennyworld");}
    public void enterDay(){ driver.findElement(day).sendKeys("22");}
    public void enterMonth(){ driver.findElement(month).sendKeys("June");}
    public void enterYrs(){ driver.findElement(yrs).sendKeys("2016");}
    public void clickNewsCheckBox(){ driver.findElement(newsLettercheckBox).click();}
    public void clickSplOfferCheckBox(){ driver.findElement(specialOfferCheckBox).click();}
    public void enterFirstName(){ driver.findElement(fName).sendKeys("Priya");}
    public void enterLastName(){ driver.findElement(lName).sendKeys("Esvantharao");}
    public void enterCompany(){ driver.findElement(comp).sendKeys("ABC Company");}
    public void enterAddress1(){ driver.findElement(Addr1).sendKeys("Flower Garden");}
    public void enterAddress2(){driver.findElement(Addr2).sendKeys("Aplha colony");}
    public void enterState(){ driver.findElement(state).sendKeys("Tamil Nadu");}
    public void enterCity(){ driver.findElement(city).sendKeys("Chennai");}
    public void enterZipCode(){ driver.findElement(zipcode).sendKeys("600100");}
    public void enterMobileNumber(){driver.findElement(mobileNum).sendKeys("9876543210");}
    public void clickCreateAcctBtn(){ driver.findElement(createAcctBtn).click();}
    public void clickContinueBtn(){ driver.findElement(continueBtn).click(); }
    public void clickDeleteBtn(){ driver.findElement(deleteBtn).click();}
    public void clickDelContinueBtn(){ driver.findElement(DelContinueBtn).click();}






}