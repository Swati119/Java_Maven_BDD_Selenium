#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Automate the practice website - login functionality

	@Ankur
  Scenario: valid login automate the practice website
    Given I launch the test automation website
    When I login with valid credentials
    #Then I should be navigated to the login page

  Scenario: invalid login automate the practice website
    Given I launch the test automation website
    When I login with invalid credentials
    Then I should be given a worng credentials message
