#Author: wahid.xxx@xx.com
#Feature: Login Feature
@LoginTest @Regression
Feature: Login Feature
  User want to verify the login functionality

  @LoginTest
  Scenario: Successfull Login Verification
    Given Open the Chrome and Launch the test application
    And Maximize the browser window
    When Enter the username and password
    Then Click on submit button
    And User Navigatted to successful login
