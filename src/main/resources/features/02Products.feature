Feature: Products

  #1
  Scenario: User add all product to cart
    Given User go to products homepage
    When User add product jacket
    And User add product backpack
    And User add product bike light
    And User add product red t shirt
    And User add product bolt t shirt
    And User add product onesie
    And User click shopping cart
    Then User success to add all products

#  Scenario: User remove tshirt products from cart
#    Given User go to shopping cart page
#    When User remove product red t shirt
#    When User remove bolt t shirt
#    Then User success to remove tshirt products
