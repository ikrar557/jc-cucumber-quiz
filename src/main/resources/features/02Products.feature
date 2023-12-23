Feature: Products

  #1
  Scenario: User add product to cart
    Given User login web saucedemo
    And User go to products homepage
    When User add product jacket
    And User add product backpack
