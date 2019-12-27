@Used_cars
Feature: Shop used car
  This feature tests shopping for used car

  Background: 
    Given User is on true car home page

  #Scenario: Shop used car
  #Given User clicks on Shop Used
  #Then User clicks on used car brand "Audi"
  #And User selects used car model "a4"
  #Then User inputs zip code "03079"
  #Then Next
  #And Verify header contains "Used Audi A4s for Sale"
  #Cucumber supports DDT - Data Driven Testing
  Scenario Outline: Shop for new cars
    Given User clicks on Shop Used
    Then User clicks on used car brand <brand>
    And User selects used car model <model>
    Then User inputs zip code <zipCode>
    Then Next
    And Verify header contains <header>

    Examples: 
      | brand  | model      | zipCode | header                           |
      | "BMW"  | "6-series" | "02155" | "Used BMW 6 Series for Sale in " |
      | "Audi" | "a4"       | "03079" | "Your 2020 Acura MDX"            |
