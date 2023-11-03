Feature: Sample demo of using Scenario Outline in Orannge HRM Login Page

@InvalidCredentials

Scenario Outline: Login with invalid credentials
 
	Given User launch the Loginpage "https://opensource-demo.orangehrmlive.com/"
	When user provides username as "<username>"
	And user provides password as "<password>"
	And user clicks the Login
	Then Login will be unsuccessfull with error message
	
    Examples: 
      | username   |  password | 
      | Admin1     |  admin1   |
      | admin1     |  admin123 | 
      | Admin      |  admin    |
      |            |           | 
