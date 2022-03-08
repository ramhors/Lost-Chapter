package com.revature.models.components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupComponent {

	private WebDriver driver;
	private WebDriverWait wdw; 
	
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstnameField;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastnameField;
	
	@FindBy(xpath = "//input[@id='age']")
	private WebElement ageField;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernameField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailField; 
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@id='role']")
	private WebElement roleField;
	
	@FindBy(xpath = "//button[@id='singup-component-signup-button']")
	private WebElement signupButton; 
	
	@FindBy(xpath = "//a[contains(text(),'Already have an account? Login')]")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@id='birthday']")
	private WebElement birthdateField;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement addressField; 
	
	@FindBy(xpath = "//div[@id='success-message']")
	private WebElement successMessageElement;
	
	@FindBy(xpath = "//div[@id='error-message']")
	private WebElement errorMessageElement;
	
	public SignupComponent(WebDriver driver) {
		
		this.driver = driver; 
		this.wdw = new WebDriverWait(this.driver, 2);
		
		PageFactory.initElements(this.driver, this);
		
	}
	
	public String getErrorMessage() {
		
		return wdw.until(ExpectedConditions.visibilityOf(errorMessageElement)).getText();
		
	}
	
	public String getSuccessMessage() {
		
		return wdw.until(ExpectedConditions.visibilityOf(successMessageElement)).getText();
		
	}
	
	public String getFirstnameText() {
		
		return wdw.until(ExpectedConditions.visibilityOf(firstnameField)).getText();
		
	}
	
	public void setFirstnameText(String firstname) {
		
		wdw.until(ExpectedConditions.visibilityOf(firstnameField)).sendKeys(firstname);
		
	}
	
	public String getLastnameText() {
		
		return wdw.until(ExpectedConditions.visibilityOf(lastnameField)).getText();
		
	}
	
	public void setLastnameText(String lastname) {
		
		wdw.until(ExpectedConditions.visibilityOf(lastnameField)).sendKeys(lastname);
		
	}
	
	public String getAgeText() {
		
		return wdw.until(ExpectedConditions.visibilityOf(ageField)).getText();
		
	}
	
	public void setAgeText(String age) {
		
		wdw.until(ExpectedConditions.visibilityOf(ageField)).sendKeys(age);
		
	}
	
	public String getUsernameText() {
		
		return wdw.until(ExpectedConditions.visibilityOf(usernameField)).getText();
		
	}
	
	public void setUsernameText(String username) {
		
		wdw.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
		
	}
	
	public String getEmailText() {
		
		return wdw.until(ExpectedConditions.visibilityOf(emailField)).getText();
		
	}
	
	public void setEmailText(String email) {
		
		wdw.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
		
	}
	
	public String getPasswordText() {
		
		return wdw.until(ExpectedConditions.visibilityOf(passwordField)).getText();
		
	}
	
	public void setPasswordText(String password) {
		
		wdw.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
		
	}
	
	public void setRoleText(String role) {
		
		wdw.until(ExpectedConditions.visibilityOf(roleField)).sendKeys(role);
		
	}
	
	
	public void clickSignupButton() throws InterruptedException {
		
		
		
		Actions action = new Actions(driver);
		
		//wdw.until(ExpectedConditions.elementToBeClickable(signupButton)).click();
		//action.moveToElement(signupButton).build().perform();
		
		//action = new Actions(driver); 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signupButton);
		Thread.sleep(500);
		action.moveToElement(signupButton, 25, 0).click().perform();
		
		
		
	}
	
	public void clickLoginLink() {
		
		wdw.until(ExpectedConditions.visibilityOf(loginLink)).click();
		
	}
	
	public void setBirthdateField(String birthdate) {
		
		wdw.until(ExpectedConditions.visibilityOf(birthdateField)).sendKeys(birthdate);
		
	}
	
	public void setAddressField(String address) {
		
		wdw.until(ExpectedConditions.visibilityOf(addressField)).sendKeys(address);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
