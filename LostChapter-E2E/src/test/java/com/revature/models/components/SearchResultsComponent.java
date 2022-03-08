package com.revature.models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsComponent {
	
	private WebDriver driver;
	private WebDriverWait wdw;

	public SearchResultsComponent(WebDriver driver) {
		this.driver = driver;
		wdw = new WebDriverWait(this.driver, 2);

		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "")
	private WebElement firstSearchResultTitle;
	
	public String getFirstSearchResultTitle() {

		return wdw.until(ExpectedConditions.visibilityOf(firstSearchResultTitle)).getText();

	}

}
