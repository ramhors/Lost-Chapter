package com.revature.models.pages;

import org.openqa.selenium.WebDriver;

import com.revature.models.components.NavbarComponent;
import com.revature.models.components.SignupComponent;

public class SignupPage {

	public NavbarComponent navbar;
	public SignupComponent signup;
	public static String pageUrl = "http://localhost:4200/signup";
	
	public SignupPage(WebDriver driver) {
		
		this.navbar = new NavbarComponent(driver);
		this.signup = new SignupComponent(driver);
		
	}
	
}
