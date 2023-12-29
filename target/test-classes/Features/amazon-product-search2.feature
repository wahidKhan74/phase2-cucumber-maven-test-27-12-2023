#Author: wahid@xxx.com
@AmazonSearchTest @SmokeTest
Feature: Search products on Amazon
  User wants test search of multiple products on amazon

  @AmazonSearchTest
  Scenario Outline: Search feature Test with multiple of products
    Given Launch amazon application on chrome
    # And Maximize the Chrome browser window
    When Enter Product Search input "<product_name>"
    Then Submit Product Search
    And Verify page title "<page_title>"

    Examples: 
      | product_name      | page_title                    |
      | Iphone 15 pro max | Amazon.in : Iphone 15 pro max |
      | Apple Mac book    | Amazon.in : Apple Mac book    |
