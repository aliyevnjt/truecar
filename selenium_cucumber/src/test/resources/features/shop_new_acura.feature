@Acura
Feature: Shop new Acura
  This feature tests shopping for new Acura

  Background: 
    Given User is on true car home page

  Scenario: Shop for the new car with Acura brand
    Given Verify number of top menus is 9
    Then Verify top menu items are
    |Jewelery & Accessories|
    |Clothing & Shoes|
    |Home & Living|
     |T|
    |Jewelery & Accessories|
    |Jewelery & Accessories|
     
    
    
