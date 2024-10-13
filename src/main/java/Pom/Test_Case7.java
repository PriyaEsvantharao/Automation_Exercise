package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Case7 {

    WebDriver driver;

    public Test_Case7(WebDriver driver) {
        this.driver = driver;
    }

    public By testcaseBtn = By.cssSelector("[href='/test_cases']");

    public void clickTestCaseBtn(){ driver.findElement(testcaseBtn).click(); }



}
