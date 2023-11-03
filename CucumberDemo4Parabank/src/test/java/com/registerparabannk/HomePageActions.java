package com.registerparabannk;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
	HomePageLocators homePageLocators = null;
	String strhomepageTitle;
	
	public HomePageActions() { 
		this.homePageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
	}
	
	public String getVerifyText() {
		return homePageLocators.homepageTitle.getText();
		
		
	}

}
