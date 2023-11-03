Feature: Login functionality of HRM Web Application with multiple ways

	@ValidCredentials
	Scenario: Using Valid credentials for verifying the Login 

	Given user launches the Login Page "https://opensource-demo.orangehrmlive.com/"
	When user enters username as "Admin"
	And user enters password as "admin123"
	And user clicks the Login
	Then user should be able to see the message as login successful
	
	@InvalidCredentials
	Scenario: Login with Invalid Credentials

	Given user launches the Login Page "https://opensource-demo.orangehrmlive.com/"
	When user enters username as "lavanya"
	And user enters password as "abc12d"
	And user clicks the Login
	Then Login will be unsuccessfull with error
	
	@InvalidCredentials @BlankCredentials
	Scenario: Login with Blank Credentials

	Given user launches the Login Page "https://opensource-demo.orangehrmlive.com/"
	When user enters username as ""
	And user enters password as ""
	And user clicks the Login
	Then Login will be unsuccessfull with error message required
	
	
	