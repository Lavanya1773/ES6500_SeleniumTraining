package com.loginparabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocatorsClass {
	
	@FindBy(name = "username")
	public WebElement userName;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//input[@value='Log In']")
	public WebElement login;
	

}
