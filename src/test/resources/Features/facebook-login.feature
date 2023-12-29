@SmokeTest
Feature: Facebook Login Verification
  I want to verify successfull or unsuccessfulllogin
	@SmokeTest
   Scenario: Unsuccessful Verification of Login functionality
    Given I should be on the facebook login page
    And I enters email adress
    And I enters password
    And I clicked on login button
    Then error message displayed with wrong credentials
    And I returns back on the facebook login page
