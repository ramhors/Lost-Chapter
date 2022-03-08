package com.revature.models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartComponent {
	
	private WebDriver driver; 
	private WebDriverWait wdw; 
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	private WebElement quantity;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
	private WebElement refreshButton;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[2]/i[1]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//body[1]/href=\"https:[1]/app-root[1]/app-cart[1]/div[1]/table[1]/tfoot[1]/tr[2]/td[4]/a[1]")
	private WebElement checkout;
	
	@FindBy(xpath = "//body[1]/href=\"https:[1]/app-root[1]/app-cart[1]/div[1]/table[1]/tfoot[1]/tr[2]/td[1]/a[1]")
	private WebElement continueShopping;
	
	public CartComponent(WebDriver driver) {
		this.driver = driver; 
		wdw = new WebDriverWait(this.driver, 2);
		
		PageFactory.initElements(this.driver, this);
		
	}
	
	public String getQuantityField() {
		return wdw.until(ExpectedConditions.visibilityOf(quantity)).getText();
	}
	
	public void setQuantityField(String productQuantity) {
		wdw.until(ExpectedConditions.visibilityOf(quantity)).sendKeys(productQuantity);
	}
	
	public void clickRefreshButton() {
		wdw.until(ExpectedConditions.elementToBeClickable(refreshButton)).click();
	}
	
	public String getCheckout() {
		return wdw.until(ExpectedConditions.visibilityOf(checkout)).getText();
	}
	
	public void setCheckout(String orderCheckout) {
		wdw.until(ExpectedConditions.visibilityOf(checkout)).sendKeys(orderCheckout);
	}
	
	public String getContinueShopping() {
		return wdw.until(ExpectedConditions.visibilityOf(continueShopping)).getText();
	}
	
	public void setContinueShopping(String backContinueShopping) {
		wdw.until(ExpectedConditions.visibilityOf(continueShopping)).sendKeys(backContinueShopping);
	}
	
	

}
