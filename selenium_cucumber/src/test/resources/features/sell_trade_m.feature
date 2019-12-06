
@sell_trade_m
Feature: Sell or trade
	This feature tests sell/trade feature
	
Background:
Given User is on true car home page

 
  Scenario: Sell or trade
    Given User clicks on Sell or Trade menu
    Then Verify menu "Enter License Plate"
    Then Verify menu "Enter VIN" 
    Then Verify menu "Enter Make/Model" 