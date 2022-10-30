@ignore
Feature: Login functionality
  Background:
    Given I am on the app homepage
    And I click on SignIn

  Scenario: Login with invalid credentials should return the error message


    And  I enter correct username
    And  I enter incorrect password
    When  I clicked the login button
    Then I should get the error message

