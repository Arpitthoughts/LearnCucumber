Feature: Validate dependency Injection in Cucumber


  @dependencyInjection @validCredentials @chrome
  Scenario: Validate login functionality with valid credentials
    Given user has launched url "https://www.saucedemo.com/"
    And user has entered username "standard_user" and password "secret_sauce"
    And User click on Login
    When user add "Sauce Labs Backpack" item to cart
    Then user remove item from cart
    And user verify the item is removed from cart