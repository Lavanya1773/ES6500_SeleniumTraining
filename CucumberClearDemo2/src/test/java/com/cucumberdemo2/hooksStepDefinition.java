//package com.cucumberdemo2;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class hooksStepDefinition {
//	WebDriver driver;
//	
//	@Before
//	public void browserlaunch() {
//		System.out.println("------------------------Before Execution----------------------------------");
//		ChromeOptions chromeoptions = new ChromeOptions();
//		chromeoptions.addArguments("----start-maximized");
//		driver = new ChromeDriver(chromeoptions);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//	}
//	
//	@Given("user launches the Login Page {string}")
//	public void user_launches_the_login_page(String url) {
//		System.out.println("---launching the url-----");
//		driver.get(url);
//	    
//	}
//
//	@When("user enters username as {string}")
//	public void user_enters_username_as(String userName) {
//		System.out.println("Enter username");
//		driver.findElement(By.name("username")).sendKeys(userName);
//	    
//	}
//
//	@When("user enters password as {string}")
//	public void user_enters_password_as(String passWord) {
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
//
//	@Then("user should be able to see the mZessage as login successful")
//	public void user_should_be_able_to_see_the_m_zessage_as_login_successful() {
//		String newPageText = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
//		System.out.println("newPageText:" + newPageText);
//		Assert.assertTrue(newPageText.equals("Dashboard"));
//	    
//	}
//	@After
//	public void close() {
//		driver.quit();
//		System.out.println("---------------------------After Execution------------------");
//		
//	}
//
//}
