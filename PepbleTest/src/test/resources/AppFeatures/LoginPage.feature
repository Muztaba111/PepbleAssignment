Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Pepble"

Scenario: Forgot Password link and SignUp link
Given user is on login page
Then forgot password link and SignUp link should be displayed

Scenario: Login with invalid credentials
Given user is on login page
When user enters username "muztaba123@mailinato.com"
And user enters password "Test122"
And user clicks on Login button
Then user gets the validation alert message
And validation message should display "These credentials do not match our records."

Scenario: Login with correct credentials
Given user is on login page
When user enters username "muztaba@mailinator.com"
And user enters password "Pepble@123"
And user click on Keep me logged in
And user clicks on Login button
Then user gets the title of the page
And page title should be "Pepble"

Scenario: Forgot Password link
Given user is on login page 
When user clicks on Forget Password link
And user enters invalid email id "muztaba1@mailinator" and click on reset password button
Then user gets the validation message as "We can't find a user with that email address."
And user click on Back to Login link
When user clicks on Forget Password link
Then user enter valid email id "muztaba@mailinator.com" and click on forget password button

Scenario: Sign Up link
Given user is on login page 
When user clicks on Sign Up link
Then user enters name "Muztaba"
Then user enters mobile number "0022335666"
And user enters email id "muztaba1@mailinator.com"
Then user enter password "Test123"
And user ReEntered wrong password "Test122"
Then user click on Sign Up button
Then users reEnter the correct password "Test123" and click on sign up button



