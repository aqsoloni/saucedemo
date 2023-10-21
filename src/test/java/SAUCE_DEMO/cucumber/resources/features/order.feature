Feature: SauceDemo Checkout Flow

  Scenario: Complete Checkout on SauceDemo
    Given user is logged in page
    When adds a product to cart
    And clicks cart
    And clicks checkout
    And fills first name, last name, and postal code
    And clicks continue
    And clicks finish
    Then directed to Checkout Complete
