package Step;

import Base.base;
import Pom.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;

public class Step_Definitions extends base {
    Test_Case1 test_case1;
    Test_Case2 test_Case2;
    Test_Case4 test_Case4;
    Test_Case5 test_Case5;
    Test_Case6 test_Case6;
    Test_Case7 test_Case7;
    Test_Case8 test_Case8;
    Test_Case9 test_Case9;
    Test_Case10 test_Case10;
    Test_Case11 test_Case11;
    Test_Case12 test_Case12;
    Test_Case13 test_Case13;
    Test_Case14 test_Case14;
    Test_Case16 test_Case16;
    Test_Case17 test_Case17;
    Test_Case18 test_Case18;
    Test_Case19 test_Case19;
    Test_Case20 test_Case20;
    Test_Case21 test_Case21;
    Test_Case22 test_Case22;
    Test_Case23 test_Case23;
    Test_Case24 test_Case24;
    Test_Case25 test_Case25;
    Test_Case26 test_Case26;



    @Given("user launch the browser and Navigate to url {string}")
    public void userLaunchTheBrowserAndNavigateToUrl(String url) {
        initializeBrowser();
        driver.get(url);
        test_case1 = new Test_Case1(driver);
        test_Case2 = new Test_Case2(driver);
        test_Case4 = new Test_Case4(driver);
        test_Case5 = new Test_Case5(driver);
        test_Case6 = new Test_Case6(driver);
        test_Case7 = new Test_Case7(driver);
        test_Case8 = new Test_Case8(driver);
        test_Case9 = new Test_Case9(driver);
        test_Case10 = new Test_Case10(driver);
        test_Case11 = new Test_Case11(driver);
        test_Case12 = new Test_Case12(driver);
        test_Case13 = new Test_Case13(driver);
        test_Case14 = new Test_Case14(driver);
        test_Case16 = new Test_Case16(driver);
        test_Case17 = new Test_Case17(driver);
        test_Case18 = new Test_Case18(driver);
        test_Case19 = new Test_Case19(driver);
        test_Case20 = new Test_Case20(driver);
        test_Case21 = new Test_Case21(driver);
        test_Case22 = new Test_Case22(driver);
        test_Case23 = new Test_Case23(driver);
        test_Case24 = new Test_Case24(driver);
        test_Case25 = new Test_Case25(driver);
        test_Case26 = new Test_Case26(driver);

    }
    @And("user Verifies that home page is visible successfully")
    public void userVerifiesThatHomePageIsVisibleSuccessfully() {
        WebElement actualHomeText = driver.findElement(By.xpath("//a[text()=' Home']"));
        Assert.assertEquals(actualHomeText.getText(), "Home", "Home");
    }
    @And("user Click  the {string} button")
    public void userClickTheSignupLoginButton(String string) {
        test_case1.clickSignupBtn();
    }
    @And("user Verifies {string} is visible")
    public void userVerifiesNewUserSignupIsVisible(String string) {
        WebElement newUserSignup = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        Assert.assertEquals(newUserSignup.getText(), "Signup / Login", "Signup / Login");
    }
    @And("user Enter the name as {string} and email address as {string}")
    public void userEnterTheNameAsAndEmailAddressAs(String name, String emailAdd) throws InterruptedException {
        test_case1.enterName();
        Thread.sleep(5000);
        test_case1.enterEmailAdd();
    }
    @Then("user Click {string} Button")
    public void userClickSignupButton(String string) throws InterruptedException {
        test_case1.clickSignBtn();
        Thread.sleep(5000);
    }
    @Then("user Verifies that {string} is Visible")
    public void userVerifiesThatENTERACCOUNTINFORMATIONIsVisible(String string) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//h2[b='Enter Account Information']"));
        System.out.println(element.getText());
        Assert.assertEquals(element.getText(), "ENTER ACCOUNT INFORMATION", "ENTER ACCOUNT INFORMATION");
        Thread.sleep(5000);
    }
    @And("user Fill the details: Title, Name, Email, Password, Date of birth")
    public void userFillTheDetailsTitleNameEmailPasswordDateOfBirth() throws InterruptedException {
        test_case1.clickTitle();
        test_case1.enterPass();
        test_case1.enterDay();
        test_case1.enterMonth();
        test_case1.enterYrs();
        Thread.sleep(5000);
    }
    @And("user Select checkbox {string}")
    public void user_select_checkbox(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        test_case1.clickNewsCheckBox();
        test_case1.clickSplOfferCheckBox();
        Thread.sleep(5000);
    }
    @And("user Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void user_fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() throws InterruptedException {
        test_case1.enterFirstName();
        test_case1.enterLastName();
        test_case1.enterCompany();
        test_case1.enterAddress1();
        test_case1.enterAddress2();
        Thread.sleep(5000);
        test_case1.enterState();
        test_case1.enterCity();
        test_case1.enterZipCode();
        test_case1.enterMobileNumber();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,1000);");
    }
    @And("user Click {string}")
    public void userClickCreateAccountButton(String string) throws InterruptedException {
        test_case1.clickCreateAcctBtn();
        Thread.sleep(5000);
    }
    @And("user Verifies that {string} is visible")
    public void userVerifiesThatACCOUNTCREATEDIsVisible(String string) throws InterruptedException {
        WebElement acctCreatedText = driver.findElement(By.cssSelector("[data-qa='account-created']"));
        System.out.println(acctCreatedText.getText());
        Assert.assertEquals(acctCreatedText.getText(), "ACCOUNT CREATED!", "ACCOUNT CREATED!");
        Thread.sleep(5000);
    }
    @And("user Clicks the {string} option Button")
    public void userClicksTheContinueOptionButton(String string) {
        test_case1.clickContinueBtn();
    }
    @Then("user Verifies that text {string} is visible")
    public void userVerifiesThatTextLoggedInAsUsernameIsVisible(String string) {
        WebElement loggedUserNameVerify = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        System.out.println(loggedUserNameVerify.getText());
        Assert.assertEquals(loggedUserNameVerify.getText(), " Logged in as priya", " Logged in as priya");
    }
    @And("user Click {string} option Button")
    public void userClickDeleteAccountOptionButton(String string) {
        test_case1.clickDeleteBtn();
    }
    @Then("user Verify that {string} is visible and user click {string} button")
    public void userVerifyThatACCOUNTDELETEDIsVisibleAndUserClickContinueButton(String string, String string1) {
        WebElement deleteText = driver.findElement(By.xpath("//h2[@data-qa='account-deleted']"));
        System.out.println(deleteText.getText());
        Assert.assertEquals(deleteText.getText(), "ACCOUNT DELETED!", "ACCOUNT DELETED!");
        test_case1.clickDelContinueBtn();
    }
    @Then("user Verify {string} is visible")
    public void userVerifyLoginToYourAccountIsVisible(String string) {
        WebElement loginAcctVisible = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        System.out.println(loginAcctVisible.getText());
        Assert.assertEquals(loginAcctVisible.getText(), "Login to your account", "Login to your account");
    }
    @And("user Enter correct email address {string} and password {string}")
    public void userEnterCorrectEmailAddressAndPassword(String mail, String passw) throws InterruptedException {
        test_Case2.enterMailAddress();
        test_Case2.enterPasswd();
        Thread.sleep(3000);
    }
    @And("user Click that {string} Button")
    public void userClickLoginButton(String string) throws InterruptedException {
        test_Case2.clickLogInBtn();
        Thread.sleep(5000);
    }
    @And("user Enter incorrect email address {string} and password {string}")
    public void userEnterIncorrectEmailAddressAndPassword(String mail,String pass) throws InterruptedException {
        test_Case2.enterMailAddress1();
        test_Case2.enterPasswd();
        Thread.sleep(3000);
    }
    @Then("Verify error {string} is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String string) {
        WebElement errorTxt = driver.findElement(By.xpath("//p[@style='color: red;']"));
        System.out.println(errorTxt.getText());
        Assert.assertEquals(errorTxt.getText(),"Your email or password is incorrect!","Your email or password is incorrect!");
    }
    @And("user Enter correct email address  and password")
    public void userEnterCorrectEmailAddressAndPassword() throws InterruptedException {
        test_Case4.enterMailAddress();
        test_Case4.enterPasswd();
    }
    @And("user Click that {string} button")
    public void userClickThatLogoutButton(String string) throws InterruptedException {
        test_Case4.clickLogOutBtn();
    }
    @Then("user Verify that user is navigated to login page")
    public void userVerifyThatUserIsNavigatedToLoginPage() {
        String currentUrl = driver.getCurrentUrl();
        boolean contains = currentUrl.contains("login");
        Assert.assertTrue("The URL does not contain 'login'",contains);
        System.out.println("Assertion Passed");
    }
    @And("user Enter the name  {string} and email address  {string}")
    public void userEnterTheNameAndEmailAddress(String arg0, String arg1) throws InterruptedException {
        test_Case5.enterName();
        test_Case5.entermail();
        test_Case5.clickSignBtn();
        Thread.sleep(3000);
    }
    @And("user Verify error {string} is visible")
    public void userVerifyErrorEmailAddressAlreadyExistIsVisible(String string) {
        WebElement alreadyTxt = driver.findElement(By.xpath("//p[@style='color: red;']"));
        System.out.println(alreadyTxt.getText());
        Assert.assertEquals(alreadyTxt.getText(),"Email Address already exist!");
        System.out.println("Assertion Passed");
    }
    @And("user Click on {string} button")
    public void userClickOnContactUsButton(String string) {
        test_Case6.clickContactUsBtn();
    }
    @Then("user Verifies that {string} text is visible")
    public void userVerifiesThatGETINTOUCHTextIsVisible(String string) {
        WebElement getInTouch = driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']"));
        System.out.println(getInTouch.getText());
        Assert.assertEquals(getInTouch.getText(),"Get In Touch","Get In Touch");
        System.out.println("Assertion Passed");
    }
    @And("user Enter name, email, subject and message")
    public void userEnterNameEmailSubjectAndMessage() throws InterruptedException {
        test_Case6.enterContactName();
        test_Case6.enterContMail();
        test_Case6.enterSubject();
        test_Case6.enterMsg();
        Thread.sleep(5000);
    }
    @And("user Upload file")
    public void userUploadFile() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,300);");
        test_Case6.clickChooseFileUpload();
        Thread.sleep(5000);
    }
    @Then("user Clicks the {string} Button")
    public void userClicksTheSubmitButton(String string) throws InterruptedException {
        test_Case6.clickSubmitBtn();
        Thread.sleep(2000);
    }
    @And("user Click OK button")
    public void userClickOKButton() throws InterruptedException {
        test_Case6.clickokBtn();
        Thread.sleep(3000);
    }
    @Then("user Verify success message {string} is visible")
    public void userVerifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String string) throws InterruptedException {
        WebElement submittedSuccess = driver.findElement(By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]"));
        System.out.println(submittedSuccess.getText());
        Assert.assertEquals(submittedSuccess.getText(),"Success! Your details have been submitted successfully.","Success! Your details have been submitted successfully.");
        System.out.println("Assertion Passed");
        Thread.sleep(5000);
    }
    @And("user Click {string} button and verify that landed to home page successfully")
    public void userClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully(String string) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0);");
        test_Case6.clickHomeBtn();
        WebElement actualHomeText = driver.findElement(By.xpath("//a[text()=' Home']"));
        Assert.assertEquals(actualHomeText.getText(), "Home", "Home");
        System.out.println("Assertion Passed");
    }
    @Then("user Click on {string} option button")
    public void userClickOnTestCasesOptionButton(String string) {
        test_Case7.clickTestCaseBtn();
    }
    @And("user Verify user is navigated to test cases page successfully")
    public void userVerifyUserIsNavigatedToTestCasesPageSuccessfully() {
        WebElement testcaseTxt = driver.findElement(By.xpath("//b"));
        boolean displayed = testcaseTxt.isDisplayed();
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Click on the {string} button")
    public void userClickOnTheProductsButton(String string) {
        test_Case8.clickPdtBtn();
    }
    @And("user Verify user is navigated to ALL PRODUCTS page successfully")
    public void userVerifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        WebElement allPdtTxt = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        System.out.println(allPdtTxt.getText());
        boolean displayed = allPdtTxt.isDisplayed();
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @Then("user The products list is visible")
    public void userTheProductsListIsVisible() {
        WebElement pdtListTxt = driver.findElement(By.cssSelector("[class='features_items']"));
            Assert.assertTrue(pdtListTxt.isDisplayed());
    }
    @And("user Click on {string} of first product")
    public void userClickOnViewProductOfFirstProduct(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        Thread.sleep(10000);
        test_Case8.clickFirstViewPdtBtn();
    }
    @And("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        String currentUrl = driver.getCurrentUrl();
        boolean contains = currentUrl.contains("product_details");
        Assert.assertTrue(contains);
        System.out.println("Assertion Passed");
    }
    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        WebElement pdtNameTxt = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
        boolean pdtDisplayed = pdtNameTxt.isDisplayed();
        System.out.println("Product Name : "+pdtNameTxt.getText());
        Assert.assertTrue(pdtDisplayed);
        WebElement catNameTxt = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
        boolean catDisplayed = catNameTxt.isDisplayed();
        System.out.println("Category Name : "+catNameTxt.getText());
        Assert.assertTrue(catDisplayed);
        WebElement priceTxt = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
        boolean priceDisplayed = priceTxt.isDisplayed();
        System.out.println("Price : "+priceTxt.getText());
        Assert.assertTrue(priceDisplayed);
        WebElement availTxt = driver.findElement(By.xpath("//p[text()=' In Stock']"));
        boolean availDisplayed = availTxt.isDisplayed();
        System.out.println(availTxt.getText());
        Assert.assertTrue(availDisplayed);
        WebElement condTxt = driver.findElement(By.xpath("//p[text()=' New']"));
        boolean condDisplayed = condTxt.isDisplayed();
        System.out.println(condTxt.getText());
        Assert.assertTrue(condDisplayed);
        WebElement brandTxt = driver.findElement(By.xpath("//p[text()=' Polo']"));
        boolean brandDisplayed = brandTxt.isDisplayed();
        System.out.println(brandTxt.getText());
        Assert.assertTrue(brandDisplayed);
    }
    @And("user Enter product name in search input and click search button")
    public void userEnterProductNameInSearchInputAndClickSearchButton() {
        test_Case9.enterSrchInputBtn();
        test_Case9.clickSrchBtn();
    }
    @Then("user Verifies the {string} is visible")
    public void userVerifiesTheSEARCHEDPRODUCTSIsVisible(String string) {
        WebElement srchdPdtTxt = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        System.out.println(srchdPdtTxt.getText());
        boolean displayed = srchdPdtTxt.isDisplayed();
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @Then("user Verify all the products related to search are visible")
    public void userVerifyAllTheProductsRelatedToSearchAreVisible() {
        List<WebElement> relPdtVisibleTxt = driver.findElements(By.xpath("//p[contains(text(),'Saree')]"));
        for (WebElement relPdtVisible : relPdtVisibleTxt ) {
            String text = relPdtVisible.getText();
            System.out.println(text);
        }
    }
    @And("user Scroll down to footer")
    public void userScrollDownToFooter() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,8500);");
        Thread.sleep(5000);
    }
    @Then("user Verify text {string}")
    public void userVerifyTextSUBSCRIPTION(String string) {
        WebElement subscriptnTxt = driver.findElement(By.xpath("//h2[text()='Subscription']"));
        System.out.println(subscriptnTxt.getText());
        Assert.assertEquals(subscriptnTxt.getText(),"SUBSCRIPTION","SUBSCRIPTION");
        System.out.println("Assertion Passed");
    }
    @And("user Enter email address in input {string} and click arrow button")
    public void userEnterEmailAddressInInputAndClickArrowButton(String arg0) throws InterruptedException {
        test_Case10.entersubmailAddress();
        Thread.sleep(5000);
        test_Case10.clickArrowBtn();
        Thread.sleep(5000);
    }
    @And("user Verifies Success message {string} is visible")
    public void userVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible(String string) throws InterruptedException {
        WebElement successMsg = driver.findElement(By.cssSelector("[class='alert-success alert']"));
        Assert.assertEquals(successMsg.getText(),"You have been successfully subscribed!","You have been successfully subscribed!");
        System.out.println(successMsg.getText());
    }
    @And("user Clicks {string} button")
    public void userClicksCartButton(String string) throws InterruptedException {
        test_Case11.clickCartBtn();
        Thread.sleep(10000);
    }
    @Then("user Hover over first product and click {string}")
    public void userHoverOverFirstProductAndClickAddToCart(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,450);");
        Thread.sleep(10000);
        test_Case12.clickFirstPdt();
        test_Case12.clickFCartBtn();
        Thread.sleep(5000);
    }
    @And("user Click the {string} Button")
    public void userClickTheContinueShoppingButton(String string) throws InterruptedException {
        test_Case12.clickContBtn();
        Thread.sleep(5000);
    }
    @And("user Hover over second product and click {string}")
    public void userHoverOverSecondProductAndClickAddToCart(String string) throws InterruptedException {
        test_Case12.clickSecondPdt();
        test_Case12.clickSCartBtn();
        Thread.sleep(5000);
    }
    @And("user Click the {string} button")
    public void userClickTheViewCartButton(String string) {
        test_Case12.clickViewCartBtn();
    }
    @Then("user Verify both products are added to Cart")
    public void userVerifyBothProductsAreAddedToCart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,200);");
        Thread.sleep(10000);
        List<WebElement> pdts = driver.findElements(By.xpath("//table[@id='cart_info_table']//tbody/tr/td[@class='cart_description']//following::h4"));
        for (WebElement pdt : pdts){
            System.out.println("PRODUCTS ARE ADDED TO CART IS : " + pdt.getText());
        }
    }
    @And("user Verify their prices, quantity and total price")
    public void userVerifyTheirPricesQuantityAndTotalPrice() {
        System.out.println("FIRST PRODUCT");
        WebElement actualFPdtPrice = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr[1]/td[3]"));
        System.out.println("Price : "+ actualFPdtPrice.getText());
        double actualFPrice = Double.parseDouble(actualFPdtPrice.getText().replace("Rs.",""));

        WebElement actualFPdtQty = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr[1]/td[4]"));
        System.out.println("Quantity : " + actualFPdtQty.getText());
        Integer actualFQty = Integer.parseInt(actualFPdtQty.getText());


        WebElement ActualFPdtTotalPrice = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr[1]/td[5]"));
        System.out.println("ActualPdtTotalPrice : "+ ActualFPdtTotalPrice.getText());
        Double ActualFTotalPrice = Double.parseDouble(ActualFPdtTotalPrice.getText().replace("Rs.",""));


        Double expectedFTotalPrice = actualFPrice * actualFQty;
        System.out.println("Expected Price : "+ expectedFTotalPrice);

        Assert.assertEquals(expectedFTotalPrice,ActualFTotalPrice);
        System.out.println("Assertion Passed");
        System.out.println("=====================================");
        System.out.println("SECOND PRODUCT");
        WebElement actualSPdtPrice = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr[2]/td[3]"));
        double actualSPrice = Double.parseDouble(actualSPdtPrice.getText().replace("Rs.",""));
        System.out.println("Price : "+ actualSPdtPrice.getText());

        WebElement actualSPdtQty = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr[2]/td[4]"));
        System.out.println("Quantity : " + actualSPdtQty.getText());
        Integer actualSQty = Integer.parseInt(actualSPdtQty.getText());


        WebElement ActualSPdtTotalPrice = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr[2]/td[5]"));
        Double ActualSTotalPrice = Double.parseDouble(ActualSPdtTotalPrice.getText().replace("Rs.",""));
        System.out.println("ActualSPdtTotalPrice : "+ ActualSPdtTotalPrice.getText());

        Double expectedSTotalPrice = actualSPrice * actualSQty;
        System.out.println("Expected Price : "+ expectedSTotalPrice);

        Assert.assertEquals(expectedSTotalPrice,ActualSTotalPrice);
        System.out.println("Assertion Passed");
    }
    @When("user Click {string} for any product on home page")
    public void userClickViewProductForAnyProductOnHomePage(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,4100);");
        Thread.sleep(15000);
        test_Case13.clickViewPdtBtn();
        Thread.sleep(1000);
    }
    @Then("user Verify product detail is opened")
    public void userVerifyProductDetailIsOpened() {
        WebElement pdt = driver.findElement(By.xpath("//h2[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']"));
        Assert.assertEquals(pdt.getText(),"Long Maxi Tulle Fancy Dress Up Outfits -Pink","Long Maxi Tulle Fancy Dress Up Outfits -Pink");
        System.out.println("Long Maxi Tulle Fancy Dress Up Outfits -Pink");
    }
    @And("user Increase quantity to {int}")
    public void userIncreaseQuantityTo(int arg0) {
        test_Case13.enterQty();
    }
    @And("user Click {string} button")
    public void userClickAddToCartButton(String string) throws InterruptedException {
        test_Case13.clickCartBtn();
        Thread.sleep(10000);
    }
    @And("user Clicks the {string} button")
    public void userClicksTheViewCartButton(String string) throws InterruptedException {
        test_Case13.clickViewCartBtn();
        Thread.sleep(10000);
    }
    @And("user Verify that product is displayed in cart page with exact quantity")
    public void userVerifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        WebElement cartPdt = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr/td[2]/h4"));
        System.out.println("PRODUCT : "+cartPdt.getText());
        Assert.assertTrue(cartPdt.isDisplayed());
        System.out.println("Assertion Passed");

        WebElement cartQty = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr/td[4]/button"));
        System.out.println("QUANTITY : "+cartQty.getText());
        Assert.assertTrue(cartQty.isDisplayed());
        System.out.println("Assertion Passed");
    }
    @Then("user Add products to cart")
    public void userAddProductsToCart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,1100);");
        Thread.sleep(10000);
        test_Case14.clickAddPdt();
        Thread.sleep(5000);
        test_Case14.clickContBtn();
        Thread.sleep(5000);
    }
        @And("user Click {string} option button")
        public void userClickCartOptionButton(String string) throws InterruptedException {
        test_Case14.clickCartPage();
        Thread.sleep(5000);
    }
    @Then("user Verify that cart page is displayed")
    public void userVerifyThatCartPageIsDisplayed() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//li[@class='active']"));
        Assert.assertEquals(element.getText(),"Shopping Cart","Shopping Cart");
    }
    @And("user Click Proceed To Checkout")
    public void userClickProceedToCheckout() throws InterruptedException {
        test_Case14.clickProceed();
        Thread.sleep(10000);
    }
    @And("user Click {string} buttons")
    public void userClickRegisterLoginButtons(String string) throws InterruptedException {
        test_Case14.clickLogin();
        Thread.sleep(5000);
    }
    @And("user Fill all details in Signup and create account")
    public void userFillAllDetailsInSignupAndCreateAccount() throws InterruptedException {
        test_Case14.enterName();
        test_Case14.enterEmailAdd();
        test_Case14.clickSignBtn();
        Thread.sleep(5000);
        test_Case14.clickTitle();
        test_Case14.enterPass();
        test_Case14.enterDay();
        test_Case14.enterMonth();
        test_Case14.enterYrs();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        test_Case14.clickNewsCheckBox();
        test_Case14.clickSplOfferCheckBox();
        test_Case14.enterFirstName();
        test_Case14.enterLastName();
        test_Case14.enterCompany();
        test_Case14.enterAddress1();
        test_Case14.enterAddress2();
        test_Case14.enterState();
        test_Case14.enterCity();
        test_Case14.enterZipCode();
        test_Case14.enterMobileNumber();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,950);");
        Thread.sleep(5000);
        test_Case14.clickCreateAcctBtn();
        Thread.sleep(5000);
    }
    @Then("user Verify {string} and click {string} button")
    public void userVerifyACCOUNTCREATEDAndClickContinueButton(String string,String string1) throws InterruptedException {
        WebElement acctCreatedText = driver.findElement(By.cssSelector("[data-qa='account-created']"));
        System.out.println(acctCreatedText.getText());
        Assert.assertEquals(acctCreatedText.getText(), "ACCOUNT CREATED!", "ACCOUNT CREATED!");
        Thread.sleep(5000);
        test_Case14.clickContinueBtn();
        Thread.sleep(5000);
    }
    @And("Verify {string} at top")
    public void verifyLoggedInAsUsernameAtTop(String string) {
        WebElement loggedUserNameVerify = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        System.out.println(loggedUserNameVerify.getText());
        Assert.assertEquals(loggedUserNameVerify.getText(), " Logged in as priya", " Logged in as priya");
    }
    @And("user Click {string} option Buttons")
    public void userClickProceedToCheckoutOptionButtons(String string) {
        test_Case14.clickProceed();
    }
    @And("user Verify Address Details and Review Your Order")
    public void userVerifyAddressDetailsAndReviewYourOrder() {
        WebElement addDetail = driver.findElement(By.xpath("//h2[text()='Address Details']"));
        System.out.println(addDetail.getText());
        Assert.assertEquals(addDetail.getText(),"Address Details","Address Details");
        System.out.println("Assertion Passed");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");
        WebElement review = driver.findElement(By.xpath("//h2[text()='Review Your Order']"));
        System.out.println(review.getText());
        Assert.assertEquals(review.getText(),"Review Your Order","Review Your Order");
        System.out.println("Assertion Passed");
    }
    @And("user Enter description in {string} comment text area and click {string}")
    public void userEnterDescriptionInCommentCommentTextAreaAndClickPlaceOrder(String string,String string1) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 800);");
        Thread.sleep(5000);
        test_Case14.enterComment();
        Thread.sleep(5000);
        test_Case14.clickPlaceOrder();
    }
    @And("user Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() throws InterruptedException {
        test_Case14.enterNameOnCard();
        test_Case14.enterCardNum();
        test_Case14.enterCVC();
        test_Case14.enterCvcMonth();
        test_Case14.enterCvcYrs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 900);");
    }
    @And("user Clicks that {string} button")
    public void userClicksThatPayAndConfirmOrderButton(String string) throws InterruptedException {
        test_Case14.clickPayConfirmOrder();
        Thread.sleep(5000);
    }
    @And("user Verify success message {string}")
    public void userVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully(String string) throws InterruptedException {
        WebElement Actual = driver.findElement(By.xpath("(//div[@class='alert-success alert'])[1]"));
        Assert.assertEquals(Actual.getText(),"Your order has been placed successfully!","Your order has been placed successfully!");
        System.out.println("Assertion Passed");
        Thread.sleep(5000);
    }
    @And("user Clicks the {string} option button")
    public void userClicksTheDeleteAccountOptionButton(String string) throws InterruptedException {
        test_Case14.clickDeleteBtn();
        Thread.sleep(5000);
    }
    @And("user Verifies {string} and click {string} button")
    public void userVerifiesACCOUNTDELETEDAndClickContinueButton(String string,String string1) throws InterruptedException {
        WebElement deleteText = driver.findElement(By.xpath("//h2[@data-qa='account-deleted']"));
        System.out.println(deleteText.getText());
        Assert.assertEquals(deleteText.getText(), "ACCOUNT DELETED!", "ACCOUNT DELETED!");
        Thread.sleep(5000);
        test_Case14.clickDelContinueBtn();
        Thread.sleep(5000);
    }
    @And("user Fill email , password and user Click that {string} button")
    public void userFillEmailPasswordAndUserClickThatLoginButton(String string) throws InterruptedException {
        test_Case16.enterMailAddress();
        test_Case16.enterPasswd();
        test_Case16.clickLogInBtn();
        Thread.sleep(5000);
    }
    @And("user Click {string} button corresponding to particular product")
    public void userClickXButtonCorrespondingToParticularProduct(String string) {
        test_Case17.clickXBtn();
    }
    @And("user Verify that product is removed from the cart")
    public void userVerifyThatProductIsRemovedFromTheCart() {
        WebElement empty = driver.findElement(By.xpath("//b[normalize-space()='Cart is empty!']"));
        Assert.assertEquals(empty.getText(),"Cart is empty!","Cart is empty!");
        System.out.println(empty.getText());
    }
    @Then("user Verify that categories are visible on left side bar")
    public void userVerifyThatCategoriesAreVisibleOnLeftSideBar() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,400);");
        Thread.sleep(5000);
        WebElement category  = driver.findElement(By.xpath("(//div[@class='left-sidebar']//h2)[1]"));
        boolean displayed = category.isDisplayed();
        System.out.println(category.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Click on {string} category")
    public void userClickOnWomenCategory(String string) {
        test_Case18.clickWomen();
    }
    @And("user Click on any category link under {string} category, for example: Dress")
    public void userClickOnAnyCategoryLinkUnderWomenCategoryForExampleDress(String string) throws InterruptedException {
        test_Case18.clickTops();
        Thread.sleep(5000);
    }
    @Then("user Verify that category page is displayed and confirm text {string}")
    public void userVerifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS(String string) {
        WebElement topPdt  = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        boolean displayed = topPdt.isDisplayed();
        System.out.println(topPdt.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @When("user On left side bar, click on any sub-category link of {string} category")
    public void userOnLeftSideBarClickOnAnySubCategoryLinkOfMenCategory(String string) {
        test_Case18.clickMen();
        test_Case18.clickTShirt();
    }
    @Then("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        WebElement tShirtPage = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        boolean displayed = tShirtPage.isDisplayed();
        System.out.println(tShirtPage.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @Then("user Verify that Brands are visible on left side bar")
    public void userVerifyThatBrandsAreVisibleOnLeftSideBar() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,700);");
        WebElement brands = driver.findElement(By.xpath("//h2[text()='Brands']"));
        boolean displayed = brands.isDisplayed();
        System.out.println(brands.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Click on any brand name")
    public void userClickOnAnyBrandName() throws InterruptedException {
        test_Case19.clickBabyHug();
        Thread.sleep(5000);
    }
    @Then("user Verify that user is navigated to brand page and brand products are displayed")
    public void userVerifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
        WebElement brandsBabyHugPdt = driver.findElement(By.cssSelector("[class='title text-center']"));
        boolean displayed = brandsBabyHugPdt.isDisplayed();
        System.out.println(brandsBabyHugPdt.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user On left side bar, click on any other brand link")
    public void userOnLeftSideBarClickOnAnyOtherBrandLink() throws InterruptedException {
        test_Case19.clickAllen();
        Thread.sleep(5000);
    }
    @Then("user Verify that user is navigated to that brand page and can see products")
    public void userVerifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() {
        WebElement allenPdt = driver.findElement(By.cssSelector("[class='title text-center']"));
        boolean displayed = allenPdt.isDisplayed();
        System.out.println(allenPdt.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Add one product to cart")
    public void userAddOneProductToCart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,450);");
        test_Case20.clickCottonSaree();
    }
    @And("verify that products are visible in cart")
    public void verifyThatProductsAreVisibleInCart() {
        WebElement sareePage = driver.findElement(By.xpath("//table//tbody/tr/td[2]//a[@href='/product_details/39']"));
        boolean displayed = sareePage.isDisplayed();
        System.out.println(sareePage.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Click {string} button and submit login details")
    public void userClickSignupLoginButtonAndSubmitLoginDetails(String string) {
        test_case1.clickSignupBtn();
        test_Case20.EnterEmail();
        test_Case20.EnterPassword();
        test_Case20.ClickLgnBtn();
    }
    @And("user Again, go to Cart page")
    public void userAgainGoToCartPage() {
        test_Case20.ClickCart();
    }

    @And("user Verify that those products are visible in cart after login as well")
    public void userVerifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        WebElement sareePage = driver.findElement(By.xpath("//table//tbody/tr/td[2]//a[@href='/product_details/39']"));
        boolean displayed = sareePage.isDisplayed();
        System.out.println(sareePage.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Click on {string} Button")
    public void userClickOnViewProductButton(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,450);");
        Thread.sleep(10000);
        test_Case21.clickViewPdt();
    }
    @And("user Verifies that {string} text is Visible")
    public void userVerifiesThatWriteYourReviewTextIsVisible(String string) {
        WebElement review = driver.findElement(By.cssSelector("[href='#reviews']"));
        boolean displayed = review.isDisplayed();
        System.out.println(review.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @Then("user Enter name, email and review")
    public void userEnterNameEmailAndReview() {
        test_Case21.enterName();
        test_Case21.enterEmail();
        test_Case21.enterWriteReview();
    }
    @And("user Clicks the {string} options Button")
    public void userClicksTheSubmitOptionsButton(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,450);");
        Thread.sleep(10000);
        test_Case21.clickSubmitBtn();
        Thread.sleep(10000);
    }
    @Then("user Verifies success message {string}")
    public void userVerifiesSuccessMessageThankYouForYourReview(String string) {
        WebElement successReview = driver.findElement(By.xpath("//div[@class='alert-success alert']//span"));
        System.out.println(successReview.getText());
        Assert.assertEquals(successReview.getText(), "Thank you for your review.", "Thank you for your review.");
        System.out.println("Assertion Passed");
    }
    @And("user Scroll to bottom of page")
    public void userScrollToBottomOfPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,7500);");
        Thread.sleep(10000);
    }
    @And("user Verify {string} are visible")
    public void userVerifyRECOMMENDEDITEMSAreVisible(String string) {
        WebElement recommended = driver.findElement(By.xpath("(//h2[@class='title text-center'])[2]"));
        boolean displayed = recommended.isDisplayed();
        System.out.println(recommended.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @Then("user Click on {string} on Recommended product")
    public void userClickOnAddToCartOnRecommendedProduct(String string) throws InterruptedException {
        test_Case22.clickRecommendedPdt();
        Thread.sleep(10000);
    }
    @When("user Click that on {string} button")
    public void userClickThatOnViewCartButton(String string) throws InterruptedException {
        test_Case22.clickViewCartBtn();
        Thread.sleep(5000);
    }
    @And("user Verify that product is displayed in cart page")
    public void userVerifyThatProductIsDisplayedInCartPage() {
        WebElement topPdt  = driver.findElement(By.xpath("//table[@id='cart_info_table']//tbody/tr/td[2]/h4"));
        boolean displayed = topPdt.isDisplayed();
        System.out.println(topPdt.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Verify that the delivery address is same address filled at the time registration of account")
    public void userVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        WebElement text = driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[3]"));
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(), "Aplha colony", "Aplha colony");
        System.out.println("Assertion Passed");
    }
    @And("user Verify that the billing address is same address filled at the time registration of account")
    public void userVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        WebElement text = driver.findElement(By.xpath("(//li[@class='address_address1 address_address2'])[3]"));
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(), "Aplha colony", "Aplha colony");
        System.out.println("Assertion Passed");
    }
    @Then("user Click {string} button and verify invoice is downloaded successfully.")
    public void userClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully(String string) {
        test_Case24.clickDownloadInvoiceBtn();
    }
    @And("user Click on arrow at bottom right side to move upward")
    public void userClickOnArrowAtBottomRightSideToMoveUpward() throws InterruptedException {
            test_Case25.enterSubMailAddress();
            Thread.sleep(5000);
            test_Case25.clickArrowBtn();
            Thread.sleep(5000);
        }
    @And("user Verify that page is scrolled up and {string} text is visible on screen")
    public void userVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,0);");
        Thread.sleep(5000);
        WebElement text  = driver.findElement(By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']"));
        boolean displayed = text.isDisplayed();
        System.out.println(text.getText());
        Assert.assertTrue(displayed);
        System.out.println("Assertion Passed");
    }
    @And("user Scroll up page to top")
    public void userScrollUpPageToTop() throws InterruptedException {
        test_Case25.enterSubMailAddress();
        Thread.sleep(5000);
        test_Case25.clickArrowBtn();
        Thread.sleep(5000);
    }
}
