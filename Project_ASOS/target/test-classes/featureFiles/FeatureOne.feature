
Feature: Search Functionality

  @live
  Scenario: Search a product
    Given User is on Home Page
    When User search a product "nike"
    Then User can see the respective products

  Scenario: Add a product to the Bag
    Given User is on Home Page
    When User search a product
    And User selects a product and selects a size
    And User add a product in the Bag
    Then User should see the respective product in the Bag

