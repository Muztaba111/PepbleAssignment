package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	private WebDriver driver;

	

	private By emailId = By.xpath("//input[@placeholder='Username']");
	private By passwd = By.xpath("//input[@placeholder='Password']");
	private By signInButton = By.xpath("//button[@type='submit']");
	private By signUpLink = By.xpath("//div[@class='uk-width-1-3@m uk-padding-small uk-background-primary login-form-box uk-position-z-index']/child::*[4]/child::*/a[1]");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	private By loginValidation = By.xpath("//*[text()='These credentials do not match our records. ']");
	private By keepMeLoggedIn = By.xpath("//*[text()=' Keep me logged in']");
	private By invalidEmail = By.xpath("//*[@id='email']");
	private By resetPasswordButton = By.xpath("//*[@type='submit' and text()='RESET PASSWORD']");
	private By resetValidationMsg = By.xpath("/html/body/main/section/div/div[2]/form/div[1]/div/span[2]/strong");
	private By backToLoginLink = By.xpath("//*[text()=' Back to Login']");
	private By name = By.xpath("//input[@placeholder='Name']");
	private By mobileNumber = By.xpath("//input[@placeholder='Mobile']");
	private By email = By.xpath("//input[@placeholder='Email']");
	private By password = By.xpath("//*[@id=\"app\"]/div/main/section/div/div[2]/form/fieldset/div[3]/div/input");
	private By reEnterPassword = By
			.xpath("//*[@class='uk-fieldset']/child::*[4]/child::*/child::*[2]");
	private By signUpButton = By.xpath("//*[@type='submit']");

	

	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}


	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isSignUpLinkExist() {

		return driver.findElement(signUpLink).isDisplayed();

	}

	public boolean isForgotPwdLinkExist() {

		return driver.findElement(forgotPwdLink).isDisplayed();

	}

	public void enterUserName(String username) {

		driver.findElement(emailId).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(passwd).sendKeys(password);

	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

	public void clickKeepMeLoggedInCheckBox() {
		driver.findElement(keepMeLoggedIn).click();
	}

	public String getValidationMsg() {
		return driver.findElement(loginValidation).getText();

	}

	public void clickOnForgetPasswordLink() {

		driver.findElement(forgotPwdLink).click();
	}

	public void enterInvalidEmailId(String invalidEmailId) {

		driver.findElement(invalidEmail).sendKeys(invalidEmailId);
		driver.findElement(resetPasswordButton).click();
	}

	public void clickOnBackToLogin() {

		driver.findElement(backToLoginLink).click();
	}
	public String getResetValidationMsg() {
		return driver.findElement(resetValidationMsg).getText();

	}

	
	public void enterValidEmailId(String validEmailId) {

		driver.findElement(invalidEmail).sendKeys(validEmailId);
		driver.findElement(resetPasswordButton).click();
	}
	public void clickOnSignUpLink() {
		driver.findElement(signUpLink).click();
	}

	public void enterName(String nameOfUser) {

		driver.findElement(name).sendKeys(nameOfUser);

	}
	public void enterPhoneNumber(String phoneNumberOfUser) {

		driver.findElement(mobileNumber).sendKeys(phoneNumberOfUser);

	}
	public void enterEmailId(String emailIdOfUser) {

		driver.findElement(email).sendKeys(emailIdOfUser);

	}
	public void enter_Password(String passwordOfUser) {

		driver.findElement(password).sendKeys(passwordOfUser);

	}
	public void reEnterWrongPassword(String reEnterPasswordOfUser) {

		driver.findElement(reEnterPassword).sendKeys(reEnterPasswordOfUser);

	}
	public void clickOnSignUpButton() {
		driver.findElement(signUpButton).click();
	
	}
	
	public void reEnterCorrectPassword(String reEnterCorrectPwdOfUser) {

		driver.findElement(reEnterPassword).clear();
		driver.findElement(password).sendKeys(reEnterCorrectPwdOfUser);
		driver.findElement(signUpButton).click();

	}



}
