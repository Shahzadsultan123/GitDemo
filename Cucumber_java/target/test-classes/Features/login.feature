Feature: Application Login
  I want to use this template for my feature file

  Scenario: Homepage default login
    Given User is on Net Banking Landing page
    When User login into application with username and password
    Then Homepage is dispalyed
    And Cards are displayed
