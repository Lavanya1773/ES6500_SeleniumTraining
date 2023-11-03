package com.registerparabannk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
	WebElement homepageTitle;


}
