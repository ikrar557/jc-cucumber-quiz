Feature: Checkout

  #1
  Scenario: User input blank first name
    Given User move to page information
    When User enter blank first name
    And User enter last name
    And User enter postal code
    And User continue checkout
    Then User required first name error

  #2
  Scenario: User input blank last name
    When User enter first name
    And User enter blank last name
    And User enter postal code
    And User continue checkout
    Then User require last name error

  #3
  Scenario: User input blank postal code
    When User enter first name
    And User enter last name
    And User enter blank postal code
    And User continue checkout
    Then User require postal code error

  #4
  Scenario: User input valid information
    When User enter first name
    And User enter last name
    And User enter postal code
    And User continue checkout
    Then User valid information

  #5
  Scenario: User completes checkout after successful Scenario #4
    Given User give valid information
    When User finishing checkout
    Then User back to products homepage
