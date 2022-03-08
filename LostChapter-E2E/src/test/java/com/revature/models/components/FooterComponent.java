package com.revature.models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterComponent {
	
	private WebDriver driver;
	private WebDriverWait wdw;

	public FooterComponent(WebDriver driver) {
		this.driver = driver;
		wdw = new WebDriverWait(this.driver, 2);

		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//*[@class=\"slider round\"]")
	private WebElement darkmodeSwitch;
	
	public void darkmodeSwitch() {

		wdw.until(ExpectedConditions.elementToBeClickable(darkmodeSwitch)).click();

	}
	
	@FindBy(xpath = "/html[1]/body[1]")
	private WebElement body;
	
	public String getBodyColor() {

		return wdw.until(ExpectedConditions.elementToBeClickable(body)).getCssValue("color");

	}

}
