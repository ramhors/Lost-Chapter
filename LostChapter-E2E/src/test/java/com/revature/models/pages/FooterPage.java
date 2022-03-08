package com.revature.models.pages;

import org.openqa.selenium.WebDriver;

import com.revature.models.components.FooterComponent;

public class FooterPage {
	
	public static String pageUrl = "";
	public FooterComponent footer;

	
	public FooterPage(WebDriver driver) {
		
		this.footer = new FooterComponent(driver);
		
	}

}
