
@sellortrade
Feature: Sell or Trade
  This feature file tests sell or trade
  
  Background: 
    Given User is on true car home page

 
  Scenario: Selling or trading a car
    Given User clicks on Sell or Trade
    Then Verify context of "Enter License Plate"
     Then Verify context of "Enter VIN"
      Then Verify context of "Enter Make/Model"
      
      
 
