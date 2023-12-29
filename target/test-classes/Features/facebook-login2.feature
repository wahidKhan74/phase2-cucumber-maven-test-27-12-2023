@SmokeTest @FbTest
Feature: Facebook Login Verification
  I want to verify successfull or unsuccessfulllogin

  @SmokeTest @FbTest
  Scenario Outline: Unsuccessful Verification of Login functionality
    Given I should be on the facebook login page
    And I enters email adress "<username>"
    And I enters password "<password>"
    And I clicked on login button
    Then error message displayed with wrong credentials
    And I returns back on the facebook login page

    Examples: 
      | username         | password |
      | abc123@gmail.com | abc@123  |
      | abc123@gmail.com | abc@7869 |
      | abc123@gmail.com | xyz@987  |
