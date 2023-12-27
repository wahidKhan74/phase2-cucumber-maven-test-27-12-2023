#Author: wahid.xxx@gmail.com
#Keywaods Summary:
#Features : List of features
Feature: Reset Password
  I want to verify reset password functionality for existing user.

  @regression @smoke
  Scenario: Successfull Reset Password Verification
    Given user should be on the logged In
    And user navigate to reset password page "/reset-password"
    # And user enters password
    And user clicks "Reset Password" button
    When user ask to reset my password
    Then user should review an email with:
      """
      		Please click this link to reset you password
      """

  # docstring
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
