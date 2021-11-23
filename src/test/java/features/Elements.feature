@Elements
Feature: Elements Feature
  Background:
    * Navigate to https://demoqa.com/
    * Click home page card named Elements

  Scenario: Check Box
    * Click menu item called Check Box
    * Click toggle of the item called Home
    * Click toggle of the item called Home
    * Click toggle of the item called Home
    * Click toggle of the item called Downloads
    * Check checkbox of the item called Downloads
    * The result contains downloads wordFile excelFile

  Scenario: Text Box
    * Click menu item called Text Box
    * Enter getirdev to the username filed
    * Enter getirdev@getir.com to the email filed
    * Enter home to the current address filed
    * Enter getirHQ to the permanent address filed
    * Click text box submit button
