#Author: wahid@xxx.com
@Search
Feature: Search products on Amazon
  User wants test search of multiple products on amazon

  @Search
  Scenario: Verification of search feature button with numbers of products
    Given Open the Chrome and launch amazon application
    # And Maximize the Chrome browser window
    When Enter the Product search
      | name              | title                         |
      | Iphone 15 pro max | Amazon.in : Iphone 15 pro max |
      | Apple Mac book    | Amazon.in : Apple Mac book    |
    Then Submit Search for the product
    And Clear search

