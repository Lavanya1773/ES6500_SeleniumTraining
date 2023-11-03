Feature: Checking the Login with user credentials
  
Background:
	Given User login the parabank Application using url "https://parabank.parasoft.com/parabank/register.htm"
	
  @Credentials
Scenario: Login with user credentials
 
    When User provides username and password
    And User clicks login button
    Then User gets a indication message