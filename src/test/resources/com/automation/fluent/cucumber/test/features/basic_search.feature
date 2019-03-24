Feature: Basic Google search
  Perform a basic search in Google

  Scenario: Check page title after search
    Given I am on the Google home page
    When I search for "Batman"
    Then the page title should start with "Batman"