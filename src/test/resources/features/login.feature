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
    And user verify following tag price of following product
      |Sauce Labs Backpack|$29.99|
      |Sauce Labs Bike Light|$9.99|
      |Sauce Labs Bolt T-Shirt|$15.99|




