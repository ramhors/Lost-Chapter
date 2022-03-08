package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.models.components.CartComponent;
import com.revature.models.components.LoginComponent;
import com.revature.models.pages.CartPage;
import com.revature.models.pages.LoginPage;
import com.revature.models.pages.SignupPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	private WebDriver driver;
	private WebDriverWait wdw;
	private String websiteUrl = "localhost:4200";

	private LoginPage loginPage;


	@Given("I am at the login page")
	public void i_am_at_the_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:4200/login");
		this.loginPage = new LoginPage(driver);
		this.loginPage.navbar.clickLoginButton();

	}

	@When("I type in a username of {string}")
	public void i_type_in_a_username_of(String string) {
		this.loginPage.login.setUsernameText(string);
	}

	@When("I type in the password  {string}")
	public void i_type_in_the_password(String string) {
		this.loginPage.login.setPasswordText(string);
	}

	@When("I click the Login button")
	public void i_click_the_login_button() {
		this.loginPage.login.clickLoginButton();
	}

	@Then("I should be taken to the main page and see username {string} and profile picture")
	public void i_should_be_taken_to_the_main_page_and_see_username_and_profile_picture(String string) {
		
		Assertions.assertEquals(string, this.loginPage.navbar.getCurrentUserUsername());
	}

	@Then("I should be given an error message of {string}")
	public void i_should_be_given_an_error_message_of(String string) {
		
		Assertions.assertEquals(string, this.loginPage.login.getErrorMessage());
	}


	@Then("I should be sent to the admin page")
	public void i_should_be_sent_to_the_admin_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("I am not logged in")
	public void i_am_not_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should not see a username and profile picture #might be guest")
	public void i_should_not_see_a_username_and_profile_picture_might_be_guest() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
