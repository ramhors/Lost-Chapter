package com.revature.models.pages;

import org.openqa.selenium.WebDriver;

import com.revature.models.components.LoginComponent;
import com.revature.models.components.NavbarComponent;

public class LoginPage {
	
	public NavbarComponent navbar;
	public LoginComponent login; 
	public static String pageUrl = "";

	
	public LoginPage(WebDriver driver) {
		
		this.navbar = new NavbarComponent(driver);
		this.login = new LoginComponent(driver);
		
	}
	
}
