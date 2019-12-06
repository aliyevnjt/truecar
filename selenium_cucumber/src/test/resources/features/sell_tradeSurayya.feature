@sell
Feature: Sell or Trade
  This feature tests sell or trade

  Background: 
    Given User is on true car home page
    
  Scenario: Sell 
  Given User clicks on Sell or Trade
  Then Verify header contains"Enter License Plate","Enter VIN","Enter Make Model"
  