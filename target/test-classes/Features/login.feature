#Author: wahid.xxx@gmail.com
#Keywaods Summary:
#Features : List of features
Feature: Login
  I want to verify login with user credentials

  @regression @smoke @login
  Scenario: Successfull Verification of Login functionality
    Given user should be on the login page
    And user enters email adress
    # And user enters password
    And user clicks "login in" button
    Then user should navigate to "My Account"

  Scenario Outline: Valid Credentials for login
    Given User want to enter valid ceredntials
    When user check for "email" and "password" fields
    And user enters following details
      | email         | password |
      | abc@gmail.com | abc@123  |
      | xyz@gmail.com | xyz@123  |
      | pqr@gmail.com | pqr@123  |
      | lmn@gmail.com | lmn@123  |
    And user clicks "login in" button

  Scenario: Unsuccessful Verification of Login functionality
    Given user should be on the login page
    And user enters email adress
    And user enters password
    And user clicks "login in" button
    Then error message displayed with wrong credentials
    And user returns back on the login page
