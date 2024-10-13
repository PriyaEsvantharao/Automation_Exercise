Feature: Automation Exercise Functionalities

 @TestCase1
  Scenario: register user
     Given user launch the browser and Navigate to url "https://www.automationexercise.com"
     And user Verifies that home page is visible successfully
     And user Click  the 'Signup / Login' button
     And user Verifies 'New User Signup!' is visible
     And user Enter the name as "priya" and email address as "PriyaDinesh@gmail.com"
     Then user Click 'Signup' Button
     Then user Verifies that 'ENTER ACCOUNT INFORMATION' is Visible
     And user Fill the details: Title, Name, Email, Password, Date of birth
     And user Select checkbox 'Sign up for our newsletter!'
     And user Select checkbox 'Receive special offers from our partners!'
     And user Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
     And user Click 'Create Account button'
     And user Verifies that 'ACCOUNT CREATED!' is visible
     And user Clicks the 'Continue' option Button
     Then user Verifies that text 'Logged in as username' is visible
     And user Click 'Delete Account' option Button
     Then user Verify that 'ACCOUNT DELETED!' is visible and user click 'Continue' button

    @TestCase2
    Scenario: Positive Login
       Given user launch the browser and Navigate to url "https://www.automationexercise.com"
       And user Verifies that home page is visible successfully
       And user Click  the 'Signup / Login' button
       Then user Verify 'Login to your account' is visible
       And user Enter correct email address "jennyrithish@gmail.com" and password "2206"
       And user Click that 'login' Button
       Then user Verifies that text 'Logged in as username' is visible
       And user Click 'Delete Account' option Button
       Then user Verify that 'ACCOUNT DELETED!' is visible and user click 'Continue' button

   @TestCase3
   Scenario: Negative Login
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click  the 'Signup / Login' button
      Then user Verify 'Login to your account' is visible
      And user Enter incorrect email address "priyajenny@gmail.com" and password "priyadinesh"
      And user Click that 'login' button
      Then Verify error 'Your email or password is incorrect!' is visible

   @TestCase4
   Scenario: Logout user
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click  the 'Signup / Login' button
      Then user Verify 'Login to your account' is visible
      And user Enter correct email address "jennyrithish@gmail.com" and password "2206"
      And user Click that 'login' button
      Then user Verifies that text 'Logged in as username' is visible
      And user Click that 'Logout' button
      Then user Verify that user is navigated to login page

   @TestCase5
   Scenario: Register User with existing email
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click  the 'Signup / Login' button
      And user Enter the name  "priya" and email address  "jennyrithish@gmail.com"
      Then user Click 'Signup' Button
      And user Verify error 'Email Address already exist!' is visible

   @TestCase6
   Scenario: Contact Us Form
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click on 'Contact Us' button
      Then user Verifies that 'GET IN TOUCH' text is visible
      And user Enter name, email, subject and message
      And user Upload file
      Then user Clicks the 'Submit' Button
      And user Click OK button
      Then user Verify success message 'Success! Your details have been submitted successfully.' is visible
      And user Click 'Home' button and verify that landed to home page successfully

   @TestCase7
   Scenario: Verify Test Cases Page
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      Then user Click on 'Test Cases' option button
      And user Verify user is navigated to test cases page successfully

   @TestCase8
   Scenario: Verify All Products and product detail page
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click on the 'Products' button
      And user Verify user is navigated to ALL PRODUCTS page successfully
      Then user The products list is visible
      And user Click on 'View Product' of first product
      And User is landed to product detail page
      And Verify that detail detail is visible: product name, category, price, availability, condition, brand

   @TestCase9
      Scenario: Search Product
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click on the 'Products' button
      And user Verify user is navigated to ALL PRODUCTS page successfully
      And user Enter product name in search input and click search button
      Then user Verifies the 'SEARCHED PRODUCTS' is visible
      Then user Verify all the products related to search are visible

   @TestCase10
      Scenario: Verify Subscription in home page
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Scroll down to footer
      Then user Verify text 'SUBSCRIPTION'
      And user Enter email address in input "jennyrithish@gmail.com" and click arrow button
      And user Verifies Success message 'You have been successfully subscribed!' is visible

   @TestCase11
      Scenario: Verify Subscription in Cart page
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Clicks 'Cart' button
      Then user Scroll down to footer
      Then user Verify text 'SUBSCRIPTION'
      And user Enter email address in input "jennyrithish@gmail.com" and click arrow button
      And user Verifies Success message 'You have been successfully subscribed!' is visible

   @TestCase12
   Scenario: Add Products in Cart
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click on the 'Products' button
      Then user Hover over first product and click 'Add to cart'
      And user Click the 'Continue Shopping' Button
      And user Hover over second product and click 'Add to cart'
      And user Click the 'View Cart' button
      Then user Verify both products are added to Cart
      And user Verify their prices, quantity and total price

   @TestCase13
   Scenario: Verify Product quantity in Cart
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      When user Click 'View Product' for any product on home page
      Then user Verify product detail is opened
      And user Increase quantity to 4
      And user Click 'Add to cart' button
      And user Clicks the 'View Cart' button
      And user Verify that product is displayed in cart page with exact quantity

   @TestCase14
   Scenario: Place Order: Register while Checkout
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      Then user Add products to cart
      And user Click 'Cart' option button
      Then user Verify that cart page is displayed
      And user Click Proceed To Checkout
      And user Click 'Register / Login' buttons
      And user Fill all details in Signup and create account
      Then user Verify 'ACCOUNT CREATED!' and click 'Continue' button
      And Verify ' Logged in as username' at top
      And user Clicks 'Cart' button
      And user Click 'Proceed To Checkout' option Buttons
      And user Verify Address Details and Review Your Order
      And user Enter description in 'comment' comment text area and click 'Place Order'
      And user Enter payment details: Name on Card, Card Number, CVC, Expiration date
      And user Clicks that 'Pay and Confirm Order' button
      And user Verify success message 'Your order has been placed successfully!'
      And user Clicks the 'Delete Account' option button
      And user Verifies 'ACCOUNT DELETED!' and click 'Continue' button

   @TestCase15
   Scenario: Place Order: Register before Checkout
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click  the 'Signup / Login' button
      And user Fill all details in Signup and create account
      Then user Verify 'ACCOUNT CREATED!' and click 'Continue' button
      And Verify ' Logged in as username' at top
      Then user Add products to cart
      And user Click 'Cart' option button
      Then user Verify that cart page is displayed
      And user Click 'Proceed To Checkout' option Buttons
      And user Verify Address Details and Review Your Order
      And user Enter description in 'comment' comment text area and click 'Place Order'
      And user Enter payment details: Name on Card, Card Number, CVC, Expiration date
      And user Clicks that 'Pay and Confirm Order' button
      And user Verify success message 'Your order has been placed successfully!'
      And user Clicks the 'Delete Account' option button
      And user Verifies 'ACCOUNT DELETED!' and click 'Continue' button

   @TestCase16
   Scenario: Place Order: Login before Checkout
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click  the 'Signup / Login' button
      And user Fill email , password and user Click that 'login' button
      Then user Verifies that text 'Logged in as username' is visible
      And user Add products to cart
      And user Click 'Cart' option button
      Then user Verify that cart page is displayed
      And user Click 'Proceed To Checkout' option Buttons
      And user Verify Address Details and Review Your Order
      And user Enter description in 'comment' comment text area and click 'Place Order'
      And user Enter payment details: Name on Card, Card Number, CVC, Expiration date
      And user Clicks that 'Pay and Confirm Order' button
      And user Verify success message 'Your order has been placed successfully!'
      And user Clicks the 'Delete Account' option button
      And user Verifies 'ACCOUNT DELETED!' and click 'Continue' button

   @TestCase17
   Scenario: Remove Products From Cart
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Add products to cart
      And user Click 'Cart' option button
      Then user Verify that cart page is displayed
      And user Click 'X' button corresponding to particular product
      And user Verify that product is removed from the cart

   @TestCase18
   Scenario: View Category Products
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      Then user Verify that categories are visible on left side bar
      And user Click on 'Women' category
      And user Click on any category link under 'Women' category, for example: Dress
      Then user Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
      When user On left side bar, click on any sub-category link of 'Men' category
      Then Verify that user is navigated to that category page

   @TestCase19
   Scenario: View & Cart Brand Products
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Click on the 'Products' button
      Then user Verify that Brands are visible on left side bar
      And user Click on any brand name
      Then  user Verify that user is navigated to brand page and brand products are displayed
      And user On left side bar, click on any other brand link
      Then user Verify that user is navigated to that brand page and can see products

   @TestCase20
   Scenario:  Search Products and Verify Cart After Login
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Click on the 'Products' button
      And user Verify user is navigated to ALL PRODUCTS page successfully
      And user Enter product name in search input and click search button
      Then user Verifies the 'SEARCHED PRODUCTS' is visible
      Then user Verify all the products related to search are visible
      And user Add one product to cart
      And user Click 'Cart' option button
      Then user Verify that cart page is displayed
      And verify that products are visible in cart
      And user Click 'Signup / Login' button and submit login details
      And user Again, go to Cart page
      And user Verify that those products are visible in cart after login as well

   @TestCase21
   Scenario:  Add review on product
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Click on the 'Products' button
      And user Verify user is navigated to ALL PRODUCTS page successfully
      And user Click on 'View Product' Button
      And user Verifies that 'Write Your Review' text is Visible
      Then user Enter name, email and review
      And user Clicks the 'Submit' options Button
      Then user Verifies success message 'Thank you for your review.'

   @TestCase22
   Scenario: Add to cart from Recommended items
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Scroll to bottom of page
      And user Verify 'RECOMMENDED ITEMS' are visible
      Then user Click on 'Add To Cart' on Recommended product
      When user Click that on 'View Cart' button
      And user Verify that product is displayed in cart page

   @TestCase23
   Scenario: Verify address details in checkout page
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Click  the 'Signup / Login' button
      And user Fill all details in Signup and create account
      Then user Verify 'ACCOUNT CREATED!' and click 'Continue' button
      And Verify ' Logged in as username' at top
      Then user Add products to cart
      And user Click 'Cart' option button
      Then user Verify that cart page is displayed
      And user Click 'Proceed To Checkout' option Buttons
      And user Verify that the delivery address is same address filled at the time registration of account
      And user Verify that the billing address is same address filled at the time registration of account
      And user Clicks the 'Delete Account' option button
      And user Verifies 'ACCOUNT DELETED!' and click 'Continue' button

   @TestCase24
   Scenario: Download Invoice after purchase order
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      And user Add products to cart
      And user Click 'Cart' option button
      Then user Verify that cart page is displayed
      And user Click Proceed To Checkout
      And user Click 'Register / Login' buttons
      And user Fill all details in Signup and create account
      Then user Verify 'ACCOUNT CREATED!' and click 'Continue' button
      And Verify ' Logged in as username' at top
      And user Clicks 'Cart' button
      And user Click 'Proceed To Checkout' option Buttons
      And user Verify Address Details and Review Your Order
      And user Enter description in 'comment' comment text area and click 'Place Order'
      And user Enter payment details: Name on Card, Card Number, CVC, Expiration date
      And user Clicks that 'Pay and Confirm Order' button
      And user Verify success message 'Your order has been placed successfully!'
      Then user Click 'Download Invoice' button and verify invoice is downloaded successfully.
      And user Click that the 'Continue' Button
      And user Clicks the 'Delete Account' option button
      And user Verifies 'ACCOUNT DELETED!' and click 'Continue' button

   @TestCase25
   Scenario:  Verify Scroll Up using 'Arrow' button and Scroll Down functionality
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      Then user Scroll down to footer
      Then user Verify text 'SUBSCRIPTION'
      And user Click on arrow at bottom right side to move upward
      And user Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

   @TestCase26
   Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
      Given user launch the browser and Navigate to url "https://www.automationexercise.com"
      And user Verifies that home page is visible successfully
      Then user Scroll down to footer
      And user Verify text 'SUBSCRIPTION'
      And user Scroll up page to top
      And user Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen


