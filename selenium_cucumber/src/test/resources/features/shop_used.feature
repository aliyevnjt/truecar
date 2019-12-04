@used
Feature: Shop used car
  This feature tests shopping for used car

  Background: 
    Given User is on true car home page
    
  Scenario: Shop used car
  Given User clicks on Shop Used
  Then User clicks on used car brand "BMW"
  And User selects used car model "6-series"
  Then User inputs zip code "02115"
  Then Next
  And Verify header contains "Used BMW 6 Series for Sale"
  And Verify location is Boston, MA