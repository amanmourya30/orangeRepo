Feature: Login functionality
  As a registered user
  I want to log into the application
  So that I can access my dashboard

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be redirected to the dashboard

  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the login page
    When the user enters invalid username and password
    And clicks the login button
    Then an error message should be displayed
