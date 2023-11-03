//package com.cucumberdemo2;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class scenarioOutlineStepDefinition {
//	
//	WebDriver driver;
//	@Before
//	public void browserlaunch() {
//		System.out.println("------------------------Before Execution----------------------------------");
//		ChromeOptions chromeoptions = new ChromeOptions();
//		chromeoptions.addArguments("----start-maximized");
//		driver = new ChromeDriver(chromeoptions);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
//	}
//	
//	@Given("User launch the Loginpage {string}")
//	public void user_launch_the_loginpage(String url) {
//		System.out.println("---launching the url-----");
//		driver.get(url);
//	    
//	}
//
//	@When("user provides username as {string}")
//	public void user_provides_username_as(String userName) {
//		System.out.println("Enter username");
//		driver.findElement(By.name("username")).sendKeys(userName);
//	    
//	}
//
//	@When("user provides password as {string}")
//	public void user_provides_password_as(String passWord) {
//		System.out.println("Enter password");
//		driver.findElement(By.name("password")).sendKeys(passWord);
//	    
//	}
//
//	@When("user clicks the Login")
//	public void user_clicks_the_login() {
//		System.out.println("Click Login");
//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();		
//	    
//	}
//
//	@Then("Login will be unsuccessfull with error message")
//	public void login_will_be_unsuccessfull_with_error_message() {
//		String newPageTexts = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
//		System.out.println("newPageText:" + newPageTexts);
//		Assert.assertTrue(newPageTexts.equals("Invalid credentials"));
//	    
//	}
//
//}
