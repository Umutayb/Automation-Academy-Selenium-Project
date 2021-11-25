Feature: Forms Feature
  Background:
    * Navigate to https://demoqa.com/
    * Click home page card named Forms
    * Click menu item called Practice Form

  Scenario: Practice form demonstration
    * Enter name Umut Ay
    * Enter surname Bora
    * Enter email umutaybora@gmail.com
    * Select gender as Male
    * Enter mobile number 5550097450
    * Set & verify date as:
      | Day | Month     | Year |
      | 2   | September | 1996 |
    * Enter subjects Programming, Geology
    * Check hobby checkboxes: Music, Reading
    * Upload file located at /Users/Umut/Github/AutomationSample/src/main/resources/files/SS.png
    * Enter current address Amsterdam
    * Select state NCR
    * Select city Gurgaon
    * Submit form
    * Wait for 10