Feature: Interactions Feature
  Background:
    * Navigate to https://demoqa.com/
    * Click home page card named Interactions

  Scenario: Sortable
    * Click menu item called Sortable
    * Drag list item Two onto Six
    * Click sortable tab option Grid
    * Drag grid item Four onto One
    * Wait for 10

  Scenario: Resizable
    * Click menu item called Resizable
    * Wait for 3
    * Resize the restricted bow by x: 150 & y: 120
    * Wait for 15