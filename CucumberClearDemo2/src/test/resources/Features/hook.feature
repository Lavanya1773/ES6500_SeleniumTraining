Feature: Login functionality of HRM Web Application
Scenario: Using Valid credentials for verifying the Login 

	Given user launches the Login Page "https://opensource-demo.orangehrmlive.com/"
	When user enters username as "Admin"
	And user enters password as "admin123"
	And user clicks the Login
	Then user should be able to see the mZessage as login successful