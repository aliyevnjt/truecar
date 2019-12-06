@Trade
Feature: Trade or Sell
  This feature tests truecar 

  Background: 
    Given User is on true car home page

  Scenario: Shop for the trade or sell
    Given User clicks on Sell or Trade
    And Verify text contain first  "Enter License Plate"
    And Verify text contain second"Enter VIN"
    And Verify text contain third"Enter Make/Model"
