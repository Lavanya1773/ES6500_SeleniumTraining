package com.loginparabank;

import org.openqa.selenium.support.PageFactory;

import com.registerparabannk.HelperClass;
import com.registerparabannk.HomePageLocators;

public class HomePageActionsClass {
	HomePageLocatorsClass homePageLocators = null;
	String strhomepageTitle;
	
	public HomePageActionsClass() { 
		this.homePageLocators = new HomePageLocatorsClass();
		
		PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
	}
	
	public String getVerifyText() {
		return homePageLocators.homepagelogout.getText();
		
		
	}

}
