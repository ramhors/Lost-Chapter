package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.models.pages.LoginPage;
import com.revature.models.pages.SearchResultPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchTest {
	
	private WebDriver driver;
	private WebDriverWait wdw;
	private String websiteUrl = "localhost:4200";

	private LoginPage loginPage;
	private SearchResultPage searchResultPage;
	
	@Given("I am at the search bar")
	public void i_am_at_the_search_bar() {
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:4200");
		this.loginPage = new LoginPage(driver);
	}

	@When("Enter in a query in the search field in the navbar of {string}")
	public void enter_in_a_query_in_the_search_field_in_the_navbar_of(String string) {
		this.loginPage.navbar.setSearchBarText(string);
	}

	@When("I click search button in navbar")
	public void i_click_search_button_in_navbar() {
		this.loginPage.navbar.clickSearchButton();
	}

	@Then("I should be taken to the search results page and see results with {string}")
	public void i_should_be_taken_to_the_search_results_page_and_see_results_with(String string) {
		
		Assertions.assertEquals(string, this.searchResultPage.searchResults.getFirstSearchResultTitle());
	}
	
}
