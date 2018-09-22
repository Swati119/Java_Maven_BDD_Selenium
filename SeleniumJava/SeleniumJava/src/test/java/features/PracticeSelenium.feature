#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Automate the practice website - login functionality

  @BasicAuth
  Scenario: Basic authorization - automate the practice website
    Given I launch the test automation website
    When I login with valid credentials
    Then I should see the correct message on page

  @Checkbox
  Scenario: Checkboxes - automate the practice website
	Given I launch the test automation website
	When I navigate to the checkbox page
	And I should check both the checkboxes