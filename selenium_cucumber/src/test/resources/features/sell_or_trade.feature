@celltrade
Feature: Sell or trade
  This feature testing sell or trade

  Background: 
    Given User is on true car home page
  
  Scenario: Test fanctionality of sell or trade
    Given User clicks on Sell or trade
    Then Verify button "Enter License Plate"
    Then Verify button "Enter VIN"
    Then verify button "Enter MakeModel"
    
    