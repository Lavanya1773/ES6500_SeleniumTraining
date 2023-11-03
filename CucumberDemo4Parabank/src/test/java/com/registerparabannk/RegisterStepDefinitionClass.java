package com.registerparabannk;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinitionClass {
	
	UtilityClass data = new UtilityClass();
	RegisterPageActions objRegister = new RegisterPageActions();
	HomePageActions objHome = new HomePageActions();

	
	@Given("User launch the parabank Application using url")
	public void user_launch_the_parabank_application_using_url() {
		HelperClass.openPage(data.url);
	    System.out.println("register page");
	}

	@When("User provide valid user details")
	public void user_provide_valid_user_details() {
		objRegister.register(data.firstname, data.lastname, data.address, data.city, data.state,data.zipcode, data.phone, data.ssn, data.username, data.password, data.confirmpassword);
		System.out.println("User Details");
	   
	}

	@When("User clicks the register")
	public void user_clicks_the_register() {
		objRegister.clickLogin();
		System.out.println("Click Register");
	    
	}

	@Then("User get a welcome message")
	public void user_get_a_welcome_message() {
		Assert.assertTrue(objHome.getVerifyText().contains("Your account was created successfully. You are now logged in."));
		System.out.println("sucessfull login");
	    
	}

}
