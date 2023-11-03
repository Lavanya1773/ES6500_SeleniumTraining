package com.registerparabannk;

import org.openqa.selenium.support.PageFactory;



public class RegisterPageActions {
	RegisterPageLocators registerPageLocators = null;
	String strfirstName,strlastName, straddress, strcity, strstate, strzipcode, strphone, strssn, strUserName, strpassword, strconfirmpassword;
	
	public RegisterPageActions() {  //constructor
		this.registerPageLocators = new RegisterPageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), registerPageLocators);
	}
	
	public void setFirstName(String strfirstName) {
		registerPageLocators.firstName.sendKeys(strfirstName);
	}
	
	
	public void setLastName(String strlastName) {
		registerPageLocators.lastName.sendKeys(strlastName);
	}
	
	public void setAddress(String straddress) {
		registerPageLocators.Address.sendKeys(straddress);
	}
	
	public void setCity(String strcity) {
		registerPageLocators.city.sendKeys(strcity);
	}
	
	
	public void setState(String strstate) {
		registerPageLocators.state.sendKeys(strstate);
	}
	
	public void setZipcode(String strzipcode) {
		registerPageLocators.zipCode.sendKeys(strzipcode);
	}
	
	public void setPhone(String strphone) {
		registerPageLocators.phone.sendKeys(strphone);
	}
	
	public void setSSN(String strssn) {
		registerPageLocators.ssn.sendKeys(strssn);
	}
	
	public void setUserName(String strUserName) {
		registerPageLocators.userName.sendKeys(strUserName);
	}
	
	public void setPassword(String strpassword) {
		registerPageLocators.password.sendKeys(strpassword);
	}
	
	public void setConfirmPassword(String strconfirmpassword) {
		registerPageLocators.confirmPassword.sendKeys(strconfirmpassword);
	}
	
	public void clickLogin() {
		registerPageLocators.registerbutton.click();
	}
	
	
	public void register(String strfirstName, String strlastName, String straddress, String strcity, String strstate, String strzipcode, String strphone, String strssn, String struserName, String strpassword, String strconfirmpassword) {
		
	
		this.setFirstName(strfirstName);
		this.setLastName(strlastName);
		this.setAddress(straddress);
		this.setCity(strcity);
		this.setState(strstate);
		this.setZipcode(strzipcode);
		this.setPhone(strphone);
		this.setSSN(strssn);
		this.setUserName(struserName);
		this.setPassword(strpassword);
		this.setConfirmPassword(strconfirmpassword);
	}


}
