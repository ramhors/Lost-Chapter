package com.revature.models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class SearchFilterComponent {

	private WebDriver driver;
	private WebDriverWait wdw;

	public SearchFilterComponent(WebDriver driver) {
		this.driver = driver;
		wdw = new WebDriverWait(this.driver, 2);

		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//body/section[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement filterByAuthor;

	public void setFilterByAuthor(String query) {

		wdw.until(ExpectedConditions.visibilityOf(filterByAuthor)).sendKeys(query);

	}

	@FindBy(xpath = "//body/section[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	private WebElement filterByAuthorButton;

	public void clickProfilePicture() {

		wdw.until(ExpectedConditions.elementToBeClickable(filterByAuthorButton)).click();

	}

	@FindBy(xpath = "//div[@id='mat-select-value-1']")
	private WebElement genreDropDownMenu;

	public void selectGenreDropDownMenu(String string) {
		// Not sure I have this correct
		((Select) wdw.until(ExpectedConditions.visibilityOf(genreDropDownMenu))).selectByVisibleText(string);

	}
	
	@FindBy(xpath = "//body/section[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement minPubYear;

	public void minPubYearText(String string) {
		
		wdw.until(ExpectedConditions.visibilityOf(minPubYear)).sendKeys(string);

	}

	@FindBy(xpath = "//body/section[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]")
	private WebElement maxPubYear;

	public void maxPubYearText(String string) {
		
		wdw.until(ExpectedConditions.visibilityOf(maxPubYear)).sendKeys(string);

	}
	
	@FindBy(xpath = "//button[contains(text(),'Apply')]")
	private WebElement pubYearFilterButton;

	public void clickPublishedYearFilterButton() {

		wdw.until(ExpectedConditions.elementToBeClickable(pubYearFilterButton)).click();

	}
	
	@FindBy(xpath = "//body/section[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
	private WebElement publisherField;

	public void publisherFieldText(String string) {
		
		wdw.until(ExpectedConditions.visibilityOf(publisherField)).sendKeys(string);

	}
	
	@FindBy(xpath = "//body/section[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement pubFilterButton;

	public void clickPublishedFilterButton() {

		wdw.until(ExpectedConditions.elementToBeClickable(pubFilterButton)).click();

	}
	
}
