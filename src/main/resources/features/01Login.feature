Feature: User Login
  # 1
  Scenario: User Login With Blank Username
    Given User enter url web saucedemo
    When User enter blank username
    And User enter password
    And User click login button
    Then User invalid login

  # 2
  Scenario: User Login With Blank Password
    Given User enter url web saucedemo
    When User enter username
    And User enter blank password
    And User click login button
    Then User invalid login

  # 3
  Scenario: User Login Invalid with Wrong Username
    Given User enter url web saucedemo
    When User enter wrong username
    And User enter password
    And User click login button
    Then User invalid login

  # 4
  Scenario: User Login Valid
    Given User enter url web saucedemo
    When User enter username
    And User enter password
    And User click login button
    Then User login successful redirect to products homepage

