@etsy
Feature: Etsy Home Page Top Menu Items
  This feature verifies top menu item on home page

  Background: 
    Given User is on etsy home page
    Given User selects "English (US)"

  Scenario: Top Menu Items
    Given Verify number of top menus is 9
    Then Verify top menu items are
      | Jewelry & Accessories |
      | Clothing & Shoes      |
      | Home & Living         |
      | Wedding & Party       |
      | Toys & Entertainment  |
      | Art & Collectibles    |
      | Craft Supplies        |
      | Vintage               |
      | Gifts                 |
    Then Verify top menu  items are from Jewelry & Accessories 
      | Accessories   |
      | Bags & Purses |
      | Necklaces     |
      | Rings         |
      | Earrings      |
      | Bracelets     |
      | Body Jewelry  |
      | All Jewelry   |
