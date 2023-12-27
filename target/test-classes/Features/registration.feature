Feature: Registration

  Background: 
    Given user on the hompage
    And user follows "Register" button

  @regression
  Scenario: Create a New User
    Given user should be on the registration page
    And user fills registration "email" with "xxxxx@gmail.com"
    And user fills registration "passsowrd" with "xxxxx"
    And user fills registration "cnf-passsowrd" with "xxxxx"
    And user clicks "Register" button
    Then User is created Successfully
    And user return back on registration page

  Scenario: User does not follow form validations
    Given user should be on the registration page
    When user enters wrong characters
    Then error message displayed with invalid password
    And user return back on registration page
