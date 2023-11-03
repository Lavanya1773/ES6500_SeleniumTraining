package com.loginparabank;

import org.openqa.selenium.By;
import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitionClass {
	
	LoginPageActions objLoginAction = new LoginPageActions();
	HomePageActionsClass objHome = new HomePageActionsClass();
	UtilityClass data = new UtilityClass();

	@Given("User login the parabank Application using url {string}")
	public void user_login_the_parabank_application_using_url(String url) {
		HelperClass.openPage(url);
		System.out.println("Launching the application");
    
	}

	@When("User provides username and password")
	public void user_provides_username_and_password() {
		objLoginAction.login(data.username, data.password);
		System.out.println("Username and password");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
    objLoginAction.clickLogin();
	}

	@Then("User gets a indication message")
	public void user_gets_a_indication_message() {
		Assert.assertTrue(objHome.getVerifyText().contains("Log Out"));
		System.out.println("Login is successful");
    
	}
}