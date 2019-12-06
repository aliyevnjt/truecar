@truecar
Feature: Shop new car
  This feature tests shopping for new car

  Background: 
    Given User is on true car home page

  
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
      
     
