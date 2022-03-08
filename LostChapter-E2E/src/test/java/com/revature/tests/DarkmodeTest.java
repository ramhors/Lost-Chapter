package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.models.pages.FooterPage;
import com.revature.models.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DarkmodeTest {
	
	private WebDriver driver;
	private WebDriverWait wdw;
	private String websiteUrl = "localhost:4200";

	private FooterPage footerPage;
	
	@Given("I am at the main page")
	public void i_am_at_the_main_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:4200");
		this.footerPage = new FooterPage(driver);
	}

	@Given("I turn on darkmode")
	public void i_turn_on_darkmode() {
		
		this.footerPage.footer.darkmodeSwitch();
		
	}

	@Then("I should see a darker theme")
	public void i_should_see_a_darker_theme() {

		String s = this.footerPage.footer.getBodyColor();
		String c = Color.fromString(s).asHex();
		
		Assertions.assertEquals("#41474D", c);
		
	}

	@Given("I have turned on darkmode")
	public void i_have_turned_on_darkmode() {
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:4200");
		this.footerPage = new FooterPage(driver);
		
		this.footerPage.footer.darkmodeSwitch();
	}

	@Given("I turn off darkmode")
	public void i_turn_off_darkmode() {

		this.footerPage.footer.darkmodeSwitch();
		
	}

	@Then("I should see a lighter theme")
	public void i_should_see_a_lighter_theme() {
		String s = this.footerPage.footer.getBodyColor();
		String c = Color.fromString(s).asHex();
		
		Assertions.assertEquals("#FFFFFF", c);
	}


}
