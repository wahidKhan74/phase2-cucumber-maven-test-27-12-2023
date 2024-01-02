#Author: wahid.xxx@your.domain.com
@FeatureTest
Feature: Add to Cart
  This feature will test funationality of adding diffrent products to the user cart (basket) from different flow

  Background: User is Loggged In

  @AddToCart
  Scenario: : Search a product and add the first result/product to the User basket
    Given User search for a product "Lenovo Laptop"
    When Add the first laptop that apears in the search results to the basket
    And User clicks on "Cart" link
    Then User basket should display added "1" items
