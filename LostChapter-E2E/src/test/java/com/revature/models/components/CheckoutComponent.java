package com.revature.models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutComponent {
	
	private WebDriver driver; 
	private WebDriverWait wdw; 
	
	@FindBy(xpath = "")
	private WebElement paymentDropdown;
	
	@FindBy(xpath = "//input[@id='card-number-input']")
	private WebElement cardNumberField;
	
	@FindBy(xpath = "//input[@id='experiation-date-month']")
	private WebElement cardExpirationMonthField;

	@FindBy(xpath = "//input[@id='experiation-date-year']")
	private WebElement cardExpirationYearField;
	
	@FindBy(xpath = "")
	private WebElement personalInfoDropdown;
	
	@FindBy(xpath = "//input[@id='ccv-input']")
	private WebElement cardCCV;
	
	@FindBy(xpath = "//input[@id='cardholder-name-input']")
	private WebElement cardholderName;
	
	@FindBy(xpath = "//input[@id='address-input-street']")
	private WebElement streetName;
	
	@FindBy(xpath = "//input[@id='first-name-input']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name-input']")
	private WebElement lastName;
	
	@FindBy(xpath = "//body[1]/href=\"https:[1]/app-root[1]/"
			+ "app-checkout[1]/div[1]/div[1]/mat-card[3]/div[1]"
			+ "/mat-radio-group[1]/mat-radio-button[1]/label[1]/span[1]/span[1]")
	private WebElement deliveryOptionOne;
	
	@FindBy(xpath = "//body[1]/href=\"https:[1]/app-root[1]/"
			+ "app-checkout[1]/div[1]/div[1]/mat-card[3]/div[1]"
			+ "/mat-radio-group[1]/mat-radio-button[2]/label[1]/span[1]/span[1]")
	private WebElement deliveryOptionTwo;
	
	@FindBy(xpath = "//button[contains(text(),'Purchase Order')]")
	private WebElement buttonPurchase;
	
	@FindBy(xpath = "//button[contains(text(),'Back to Cart')]")
	private WebElement buttonBackToCart;
	
	public CheckoutComponent(WebDriver driver) {
		
		this.driver = driver;
		wdw = new WebDriverWait(this.driver, 2);
		
		PageFactory.initElements(this.driver, this);;
	}
	
	public String getCardNumberField() {
		
		return wdw.until(ExpectedConditions.visibilityOf(cardNumberField)).getText();
		
	}
	
	public void setCardExpritionField(String cardNumber) {
		
		wdw.until(ExpectedConditions.visibilityOf(cardNumberField)).sendKeys(cardNumber);
		
	}
	
	public String getCardExpirationMonthField() {
		
		return wdw.until(ExpectedConditions.visibilityOf(cardExpirationMonthField)).getText();
		
	}
	
	public void setCardExpirationMonthField(String cardYearField) {
		
		wdw.until(ExpectedConditions.visibilityOf(cardExpirationMonthField)).sendKeys(cardYearField);
		
	}
	
	public String getCardExpirationYearField() {
		
		return wdw.until(ExpectedConditions.visibilityOf(cardExpirationYearField)).getText();
		
	}
	
	public void setCardExpirationYearField(String cardMonthField) {
		
		wdw.until(ExpectedConditions.visibilityOf(cardExpirationYearField)).sendKeys(cardMonthField);
		
	}
	
	public String getCardCvvNumber() {
		
		return wdw.until(ExpectedConditions.visibilityOf(cardCCV)).getText();
		
	}
	
	public void setCardCvvNumber(String cvv) {
		
		wdw.until(ExpectedConditions.visibilityOf(cardCCV)).sendKeys(cvv);
		
	}
	
	public String getCardholderName() {
		
		return wdw.until(ExpectedConditions.visibilityOf(cardholderName)).getText();
		
	}
	
	public void setCardholderName(String nameOnCard) {
		
		wdw.until(ExpectedConditions.visibilityOf(cardholderName)).sendKeys(nameOnCard);	
		
	}
	
	public String getStreetName() {
		
		return wdw.until(ExpectedConditions.visibilityOf(streetName)).getText();
		
	}
	
	public void setStreetName(String sName) {
		
		wdw.until(ExpectedConditions.visibilityOf(streetName)).sendKeys(sName);
		
	}
	
	public String getFirstName() {
		
		return wdw.until(ExpectedConditions.visibilityOf(firstName)).getText();
		
	}
	
	public void setFirstName(String fName) {
		
		wdw.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(fName);
		
	}
	
	public String getLastName() {
		
		return wdw.until(ExpectedConditions.visibilityOf(lastName)).getText();
		
	}
	
	public void setLastName(String lName) {
		
		wdw.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(lName);
		
	}
	
	public String getDeliveryOptionOne() {
		
		return wdw.until(ExpectedConditions.visibilityOf(deliveryOptionOne)).getText();
		
	}
	
	public void setDeliveryOptionOne(String deliveryOne) {
		
		wdw.until(ExpectedConditions.visibilityOf(deliveryOptionOne)).sendKeys(deliveryOne);
		
	}
	
	public String getDeliveryOptionTwo() {
		
		return wdw.until(ExpectedConditions.visibilityOf(deliveryOptionTwo)).getText();
		
	}
	
	public void setDeliveryOptionTwo(String deliveryTwo) {
		
		wdw.until(ExpectedConditions.visibilityOf(deliveryOptionTwo)).sendKeys(deliveryTwo);
		
	}
	
	public void clickPurchaseButton() {
		
		wdw.until(ExpectedConditions.elementToBeClickable(buttonPurchase)).click();
		
	}
	
	public void clickBackToCartButton() {
		
		wdw.until(ExpectedConditions.elementToBeClickable(buttonBackToCart)).click();
		
	}
	
	
}
