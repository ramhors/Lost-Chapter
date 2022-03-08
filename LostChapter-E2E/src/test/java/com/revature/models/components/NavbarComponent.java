package com.revature.models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavbarComponent {

	private WebDriver driver;
	private WebDriverWait wdw;

	@FindBy(xpath = "//header/div[@id='nav-bar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[1]/input[1]")
	private WebElement searchBarField;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement searchButton; // actually executes the search and takes you to the search results page...or it
										// should...

	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	private WebElement signupButton;

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	private WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Cart')]")
	private WebElement cartButton;

	@FindBy(xpath = "//a[contains(text(),'Lost Chapter')]")
	private WebElement homeButton; // clicking this takes us back to the front page

	@FindBy(xpath = "//a[contains(text(),'The Lost Chapter')]")
	private WebElement websiteLogo; // does the same thing as home button

	@FindBy(xpath = "")
	private WebElement profilePicture; // takes us to the profile page

	@FindBy(xpath = "")
	private WebElement currentUserUsername;

	public NavbarComponent(WebDriver driver) {

		this.driver = driver;
		wdw = new WebDriverWait(this.driver, 2);

		PageFactory.initElements(this.driver, this);

	}

	public String getSearchBarText() {

		return wdw.until(ExpectedConditions.visibilityOf(searchBarField)).getText();

	}

	public void setSearchBarText(String query) {

		wdw.until(ExpectedConditions.visibilityOf(searchBarField)).sendKeys(query);

	}

	public void clickSearchButton() {

		wdw.until(ExpectedConditions.elementToBeClickable(searchButton)).click();

	}

	public void clickSignupButton() {

		wdw.until(ExpectedConditions.elementToBeClickable(signupButton)).click();

	}

	public void clickLoginButton() {

		wdw.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

	}

	public void clickCartButton() {

		wdw.until(ExpectedConditions.elementToBeClickable(cartButton)).click();

	}

	public void clickHomeButton() {

		wdw.until(ExpectedConditions.elementToBeClickable(homeButton)).click();

	}

	public void clickWebsiteLogo() {

		wdw.until(ExpectedConditions.elementToBeClickable(websiteLogo)).click();

	}

	public void clickProfilePicture() {

		wdw.until(ExpectedConditions.elementToBeClickable(profilePicture)).click();

	}

	public String getCurrentUserUsername() {

		return wdw.until(ExpectedConditions.visibilityOf(currentUserUsername)).getText();

	}

}
