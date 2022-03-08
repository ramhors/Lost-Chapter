package com.revature.models.pages;

import org.openqa.selenium.WebDriver;

import com.revature.models.components.FrontPageComponent;
import com.revature.models.components.NavbarComponent;
import com.revature.models.components.ProductModale;

public class FrontPage {
	
	public FrontPageComponent frontPageComponent; 
	public NavbarComponent navbar; 
	public ProductModale product;
	
	public static String pageUrl = "";
	
	public FrontPage(WebDriver driver) {
		
		this.frontPageComponent = new FrontPageComponent(driver);
		this.navbar = new NavbarComponent(driver);
		this.product = new ProductModale(driver);
		
	}

}
