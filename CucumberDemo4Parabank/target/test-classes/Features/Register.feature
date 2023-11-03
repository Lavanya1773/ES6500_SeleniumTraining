Feature: Register in the Parabank Application

  Scenario: User provides valid credentials to register
    Given User launch the parabank Application using url 
    When User provide valid user details
    And User clicks the register
    Then User get a welcome message