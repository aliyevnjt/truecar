@Truecar
Feature: Shop new car
  This feature tests shopping for new car

  Background: 
    Given User is on true car home page

  #Scenario: Shop for the new car with BMW brand
    #Given User clicks on Shop New
    #Then User clicks on brand "BMW"
    #Then User selects model "m5"
    #Then User inputs zip code "02155"
    #Then Next
    #Then Skip for now
    #And Verify header is "Your 2020 BMW M5"
    #And Verify Style is "Competition"
    #And Verify Standard Features & Specs contains "Gas 4.4L V8"

  #Cucumber supports DDT - Data Driven Testing
  Scenario Outline: Shop for new cars
    Given User clicks on Shop New
    Then User clicks on brand <brand>
    Then User selects model <model>
    Then User inputs zip code <zipCode>
    Then Next
    Then Skip for now
    And Verify header is <header>
    And Verify Style is <style>
    And Verify Standard Features & Specs contains <specs>

    Examples: 
      | brand   | model | zipCode | header                | style                            | specs         |
      | "BMW"   | "m5"  | "02155" | "Your 2020 BMW M5"    | "Competition"                    | "Gas 4.4L V8" |
      | "Acura" | "mdx" | "01886" | "Your 2020 Acura MDX" | "SH-AWD with Technology Package" | "Gas 3.5L V6" |
      
     
