
@tag
Feature: Sell or Trade
 This feature verify the option in Sell or Trade

Background: 
    Given User is on true car home page
  
  Scenario: Sell or Trade
    Given User clicks on Sell or Trade
    And Verify  contains "Enter Make/Model"
