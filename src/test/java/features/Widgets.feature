Feature: Widgets Feature
  Background:
    * Navigate to https://demoqa.com/
    * Click home page card named Widgets

  Scenario: Hover Over
    * Click menu item called Menu
    * Hover over navigation tab Main Item 1
    * Hover over navigation tab Main Item 3
    * Hover over navigation tab Main Item 2
    * Hover over navigation tab Sub Item
    * Hover over navigation tab SUB SUB LIST »
    * Hover over navigation tab Sub Sub Item 2

    Scenario: Dropdown Interaction
      * Click menu item called Select Menu
      * Expand value dropdown
      * Click value dropdown item named A root option
      * Expand value dropdown
      * Click value dropdown item named Group 2, option 1
      * Wait for 3
