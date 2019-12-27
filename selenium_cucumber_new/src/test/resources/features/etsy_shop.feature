@shop
Feature: Searching and shoping from Etsy
  The feature tests search and shop from Etsy

  Background: 
    Given User is on etsy home page
    Given User selects "English (US)"

  Scenario: Shop on Etsy website
    Then Shop for "shoe"
    And Select first item
    And Verify page contains "Item details"

 