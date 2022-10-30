@ignore

Feature: Homepage Logo and Cart button

  Background:
    Given I am on the app homepage


  Scenario: Verify logo and cart button are displayed on the Homepage

    #Given I lunch a browser
    #And I enter application url
    When I wait for 5 seconds
    Then I should see application logo and add to cart button