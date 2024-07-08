Feature:As a user I want to validate the login functionality

  @dataTableTest
  Scenario: Validate Login with valid credentials
    Given user has launched url "https://www.saucedemo.com/"
    And user has entered credentials
    |username|standard_user|
    |password|secret_sauce |
    When User click on Login
    Then user verify following product are visible on dashboard
    |Sauce Labs Backpack|
    |Sauce Labs Bike Light|
    |Sauce Labs Bolt T-Shirt|



