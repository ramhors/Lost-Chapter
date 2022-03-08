package com.revature.models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductModale {
	
	private WebDriver driver; 
	private WebDriverWait wdw; 
	
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-display-product-modal[1]/div[1]/mat-dialog-content[1]/div[1]/div[2]/button[1]")
	private WebElement addToCartButton; 
	
	@FindBy(xpath = "//select[@id='qty']")
	private WebElement quantityDropdown;
	
	@FindBy(xpath = "//option[contains(text(),'5')]")
	private WebElement quantityFive; 
	
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-display-product-modal[1]/div[1]/mat-dialog-content[2]/div[1]/button[1]")
	private WebElement cancelButton; 
	
	public ProductModale(WebDriver driver) {
		
		this.driver = driver;
		this.wdw = new WebDriverWait(this.driver, 2);
		PageFactory.initElements(this.driver, this);
		
	}
	
	public void clickAddToCart() {
		
		Actions action = new Actions(driver);
		action.moveToElement(addToCartButton, 5, 0).click().perform();
		
	}
	
	public void clickCancelButton() {
		
		Actions action = new Actions(driver);
		action.moveToElement(cancelButton, 5, 0).click().perform();
		
	}
	
	public void clickQuantityDropdown() {
		
		Actions action = new Actions(driver);
		action.moveToElement(quantityDropdown, 5, 0).click().perform();
		
	}
	
	public void clickQuantityFive() {
		
		Actions action = new Actions(driver);
		action.moveToElement(quantityFive, 5, 0).click().perform();
		
	}
	
	

}
