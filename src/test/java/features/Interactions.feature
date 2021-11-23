Feature: Interactions Feature
  Background:
    * Navigate to https://demoqa.com/
    * Click home page card named Interactions

  Scenario: Sortable
    * Click menu item called Sortable
    * Drag list item Two onto Six
    * Click sortable tab option Grid
    * Drag grid item Four onto One

  Scenario: Resizable
    * Click menu item called Resizable
    * Resize the restricted bow by x: 150 & y: 120