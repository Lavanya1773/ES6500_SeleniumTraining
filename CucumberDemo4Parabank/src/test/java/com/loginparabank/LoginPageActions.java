package com.loginparabank;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	LoginPageLocatorsClass loginPageLocators = null;
	
	public LoginPageActions() {  //constructor
		this.loginPageLocators = new LoginPageLocatorsClass();
		
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	
	//set username in textbox
	public void setUserName(String strUserName) {
		loginPageLocators.userName.sendKeys(strUserName);
	}
	
	//set password in textbox
	public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}
	
	//set click
	public void clickLogin() {
		loginPageLocators.login.click();
	}
	
	public void login(String strUserName, String strPassword) {
		
		//fill username
		this.setUserName(strUserName);
		//fill password
		this.setPassword(strPassword);
	}

}
