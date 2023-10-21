Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters valid username and password
    And clicks the login button
    Then user should be redirected to the home page


  Scenario: Unsuccessful login with invalid credentials
    Given user is on the login page
    When user enters invalid username and password
    And clicks the login button
    Then user should see an error message
