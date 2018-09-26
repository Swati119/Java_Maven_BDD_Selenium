Feature: Automate the practice website

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

  @Dropdown
  Scenario: Dropdown list - automate the practice website
    Given I launch the test automation website
    When I navigate to the dropdown page
    And I should select Option1 from the dropdown list

  @RightClick
  Scenario: Right click - automate the practice website
    Given I launch the test automation website
    When I navigate to the context menu page
    And I should right click and select option
    Then I should see a javascript pop messsage

  @xml
  Scenario: Read xml - automate the practice website
    Given I launch the test automation website
    When I navigate to the forgot password page
    And I send email from the xml
