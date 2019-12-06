@Acura
Feature: Shop new Acura
  This feature tests shopping for new Acura

  Background: 
    Given User is on true car home page

  Scenario: Shop for the new car with Acura brand
    Given User clicks on Shop New
    Then User clicks on brand "Acura"
    Then User selects model "mdx"
    Then User inputs zip code "01886"
    Then Next
    Then Skip for now
    And Verify header is "Your 2020 Acura MDX"
    And Verify Style is "SH-AWD with Technology Package"
    And Verify Standard Features & Specs contains "Gas 3.5L V6"
    
     #Create Feature file 
     #Steps: 1. Go to true car
     #				 2. Click on sell or trade
     #				 3. Verify menus: Enter License Plate, Enter VIN, Enter Make/Model
     #Implement Step Defs for unimplemented steps
     #Create java page for sell or trade
     #Tag Feature
     #Run Feature
     #If test case is passing push it to remote repository
     #Create pull request and assign to your peer to merge with develop branch
     #
    
    
    
     
    
    
