package com.revature.tests;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.models.pages.CartPage;
import com.revature.models.pages.LoginPage;
import com.revature.models.pages.SignupPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	private WebDriver driver;
	private WebDriverWait wdw;
	private String websiteUrl = "http://localhost:4200";

	private CartPage cartPage;
	private LoginPage loginPage;
	private SignupPage signupPage;

	@AfterEach
	public void teardown() {
		
		this.driver.close();
		this.driver.quit();
		
	}
	
	@Given("I am at the signup page")
	public void i_am_at_the_signup_page() {

		System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		wdw = new WebDriverWait(this.driver, 2);
		driver.get(SignupPage.pageUrl);

		wdw.until(ExpectedConditions.urlToBe(SignupPage.pageUrl));

		this.signupPage = new SignupPage(driver);

	}

	@When("I type in a signup username of {string}") // username needs to be unique
	public void i_type_in_a_signup_username_of(String string) {

		if (string.equals("unique")) {

			Random newRandGen = new Random();
			int low = 65;
			int high = 90; 
			String newUsername = "";

			for (int i = 0; i < 20; i++) {

				newUsername += (char) (newRandGen.nextInt(high - low) + low);

			}

			this.signupPage.signup.setUsernameText(newUsername);

		}

		else {

			this.signupPage.signup.setUsernameText(string);

		}

	}

	@When("I type in the signup password  {string}")
	public void i_type_in_the_signup_password(String string) {

		this.signupPage.signup.setPasswordText(string);

	}

	@When("I type in an signup email of {string}") // email needs to be unique
	public void i_type_in_an_signup_email_of(String string) {

		
		if (string.equals("unique")) {

			
			Random newRandGen = new Random();
			int low = 65;
			int high = 90;
			String newEmail = "";

			for (int i = 0; i < 20; i++) {
				
				newEmail += (char) (newRandGen.nextInt(high - low) + low); 

			}
			
			newEmail += "@gmail.com";

			this.signupPage.signup.setEmailText(newEmail);

		}
		
		else {
			
			this.signupPage.signup.setEmailText(string);
			
		}
		

	}

	@When("I type in a signup first name of {string}")
	public void i_type_in_a_signup_first_name_of(String string) {

		this.signupPage.signup.setFirstnameText(string);

	}

	@When("I type in a signup last name of {string}")
	public void i_type_in_a_signup_last_name_of(String string) {

		this.signupPage.signup.setLastnameText(string);

	}

	@When("I type in a signup age of {string}")
	public void i_type_in_a_signup_age_of(String string) {

		this.signupPage.signup.setAgeText(string);

	}

	@When("I select a signup role of {string}")
	public void i_select_a_signup_role_of(String string) {

		this.signupPage.signup.setRoleText(string);

	}

	@When("I click the signup button")
	public void i_click_the_signup_button() throws InterruptedException {

		this.signupPage.signup.clickSignupButton();

	}

	@When("I type in a birthday of {string}")
	public void i_type_in_a_birthday_of(String string) {

		this.signupPage.signup.setBirthdateField(string);

	}

	@When("I type in an address of {string}")
	public void i_type_in_an_address_of(String string) {

		this.signupPage.signup.setAddressField(string);

	}

	@Then("I should be see a success message saying you have successfully signed up")
	public void i_should_be_see_a_success_message_saying_you_have_successfully_signed_up() {

		String message = this.signupPage.signup.getSuccessMessage();

		Assertions.assertEquals("Successfully Sign up", message);
		this.driver.close();
		this.driver.quit();

	}

	@Then("I should see a signup error message of {string}")
	public void i_should_see_a_signup_error_message_of(String string) {

		String message = this.signupPage.signup.getErrorMessage();

		Assertions.assertEquals(string, message);
		this.driver.close();
		this.driver.quit();

	}

}
