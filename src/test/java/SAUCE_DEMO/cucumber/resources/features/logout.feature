Feature: Logout Functionality

  Scenario: User logs out successfully
    Given User is logged in
    When User clicks on the menu button
    And User clicks on the logout button
    Then User should be logged out successfully
