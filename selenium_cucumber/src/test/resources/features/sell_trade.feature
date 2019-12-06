@sell_tade
Feature: Sell or Trade JN
  This feature tests sell and trade

  Background: 
    Given User is on true car home page

  Scenario: Shop used car
    Given User clicks on Sale and Trade
    Then Verify first header contains " Enter License Plate "
    Then Verify second header contains "Enter VIN"
    Then Verify third header contains "Enter Mae/Model"
    