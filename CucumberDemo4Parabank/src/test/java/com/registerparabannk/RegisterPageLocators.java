package com.registerparabannk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	@FindBy(name = "customer.firstName")
	WebElement firstName;
	
	@FindBy(name = "customer.lastName")
	WebElement lastName;
	
	@FindBy(name = "customer.address.street")
	WebElement Address;
	
	@FindBy(name = "customer.address.city")
	WebElement city;
		
	@FindBy(name = "customer.address.state")
	WebElement state;
	
	@FindBy(name = "customer.address.zipCode")
	WebElement zipCode;
	
	@FindBy(name = "customer.phoneNumber")
	WebElement phone;
	
	@FindBy(name = "customer.ssn")
	WebElement ssn;
	
	@FindBy(name = "customer.username")
	WebElement userName;
	
	@FindBy(name = "customer.password")
	WebElement password;
	
	@FindBy(name = "repeatedPassword")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@value='Register']")
	WebElement registerbutton;
	
	

}
