Feature: Add to Cart

  Scenario: User adds an item to the cart
    Given the user is logged in on SauceDemo
    When the user adds a product to the cart
    Then the cart displays the added item count
