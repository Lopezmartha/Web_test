@ignore
Feature: Login Functionality

  Background:
    Given I am on the app homepage
    And I click on SignIn

  Scenario: Wrong username with correct password should return correct error message


    When I enter wrong username
    And  I enter correct password
    When I click the button to login
    Then I should grt the right error message

