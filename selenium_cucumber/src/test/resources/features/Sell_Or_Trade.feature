
@SellTrade
Feature: Sell or Trade
  This feature tests sell or trade location

   Background: 
    Given User is on true car home page
    
   Scenario: Sell or Trade
   Given User clicks on Sell or Trade button
   And Verify button "Enter License Plate"
   And Verify button "Enter VIN"
   And Verify button "Enter Make/Model"
   
  