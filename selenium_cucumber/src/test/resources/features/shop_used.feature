@used
Feature: Title of your feature
  I want to use this template for my feature file

Background:
Given User is on true car home page

Scenario:  Shop used car
Given User clicks on Shop Used
Then User clicks on used car brand"BMW"
And User selects used car model"2-series"
Then User inputs zip code "02115"
Then Next
And Verify header contains "Used BMW 2 Series for Sale"
And Verify location is Boston,MA
   