package stepDefinations;

import org.junit.Assert;

import com.pages.Login_Page;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private static String title;
	private static String validationMessage;
	private static String resetValidationMsg;


	private Login_Page loginPage = new Login_Page(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver().get("http://pepble.com/#/signIn");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {

		title = loginPage.getLoginPageTitle();
		System.out.println("Login Page Title is: " + title);

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));

}
	
	@Then("forgot password link and SignUp link should be displayed")
	public void forgot_password_link_and_SignUp_link_should_be_displayed() {

		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
		Assert.assertTrue(loginPage.isSignUpLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {

		loginPage.enterUserName(username);

	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		
		loginPage.enterPassword(password);

	}

	@And("user clicks on Login button")
	public void user_clicks_on_Login_button() {
		
		loginPage.clickOnLogin();

	}
	
	@Then("user gets the validation alert message")
	public void user_gets_the_validation_alert_message() {
		
		validationMessage = loginPage.getValidationMsg();
		System.out.println("Validation msg is: " + validationMessage);
	}
	
   @And("validation message should display {string}")
   
   public void validation_message_should_display(String expectedValidationMessage) {
	   
	   Assert.assertTrue(validationMessage.contains(expectedValidationMessage));
	   
   }
   
   @And("user click on Keep me logged in")
   
   public void user_click_on_Keep_me_logged_in() {
	   
	   loginPage.clickKeepMeLoggedInCheckBox();
   }   
   
	
	
	@When("user clicks on Forget Password link")
	public void user_clicks_on_Forget_Password_link() {
		
		loginPage.clickOnForgetPasswordLink();
		
		
	}

	@And("user enters invalid email id {string} and click on reset password button")
	public void user_enters_invalid_email_id_and_click_on_reset_password_button(String invalidEmailId) {
		
		loginPage.enterInvalidEmailId(invalidEmailId);
		
		
	}
	@Then("user gets the validation message as {string}")
	public void user_gets_the_validation_message_as(String expectedResetValidation) {
		
		resetValidationMsg=loginPage.getResetValidationMsg();
		Assert.assertTrue(resetValidationMsg.contains(expectedResetValidation));
	   
	}

	
	@Then("user click on Back to Login link")
	public void user_click_on_back_to_login_link() {
		loginPage.clickOnBackToLogin();
	   
	}

	@Then("user enter valid email id {string} and click on forget password button")
	public void user_enter_valid_email_id_and_click_on_forget_password_button(String validEmailId) {
		
		loginPage.enterValidEmailId(validEmailId);
	    
	}

	@When("user clicks on Sign Up link")
	public void user_clicks_on_Sign_Up_link() {
		
		loginPage.clickOnSignUpLink();
	}
	@Then("user enters name {string}")
	public void user_enters_name(String nameOfUser) {
		
		loginPage.enterName(nameOfUser);
	}
	@Then("user enters mobile number {string}")
	public void user_enters_mobile_number(String phoneNumberOfUser) {
		
		loginPage.enterPhoneNumber(phoneNumberOfUser);
		
	}
	@And("user enters email id {string}")
	public void user_enters_email_id(String emailIdOfUser) {
		loginPage.enterEmailId(emailIdOfUser);
		
	}
	@Then("user enter password {string}")
	public void user_enter_password(String passwordOfUser) {
	     
		loginPage.enter_Password(passwordOfUser);
	}
	@And("user ReEntered wrong password {string}")
	public void user_ReEntered_wrong_password(String reEnterPasswordOfUser) {
		
		loginPage.reEnterWrongPassword(reEnterPasswordOfUser);
	}
	   
	@Then("user click on Sign Up button")
	public void user_click_on_Sign_Up_button() {
		
		loginPage.clickOnSignUpButton();
	}
	
	
	@Then("users reEnter the correct password {string} and click on sign up button")
	public void users_reEnter_the_correct_password_and_click_on_sign_up_button(String reEnterCorrectPwdOfUser) {
		loginPage.reEnterCorrectPassword(reEnterCorrectPwdOfUser);
		
	}
	   
   
	
}
