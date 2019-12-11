@shopingFromEtsy
Feature: Searching and shoping from Etsy
  The feature tests search and shop from Etsy

  Background: 
    Given User is on etsy home page
    Given User selects "English (US)"

  Scenario Outline: User want to search and shop on Etsy
    Given User search item <item>
    Then User click to special offers <special offers>
    Then User click to price <price>
    Then User click to country <conutry>

    Examples: 
      | item     | special offers  | price       | conutry  |
      | "toys"   | "FREE shipping" | "Under $25" | "Azerbaijan" |
      | "books"  | "On sale"       | "Any price" | "Turkey"     |
      | "jacket" | "FREE shipping" | "Over $250" | "Sweden" |
