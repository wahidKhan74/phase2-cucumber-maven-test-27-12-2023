#Author: wahid.xxx@xx.com
#Feature: Login Feature
@HompageTest @Regression
Feature: Amazon Homepage Test
  User want to verify the amazon hompegae functinality

  @HompageTest
  Scenario: Amazon Homepage title verification
    Given Open the Chrome and Launch the amazon application
    When User on amazon homepage
    Then Verify meta title of the page

  @HompageTest
  Scenario: Should not be Amazon Homepage
    Given Open the Chrome and Launch the amazon application
    When Navigate user on dirrent link
    Then Verify meta title of the curent page
