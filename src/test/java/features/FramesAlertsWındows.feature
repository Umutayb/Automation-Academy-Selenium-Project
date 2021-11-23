Feature: Alerts, Frame & Windows Feature
  Background:
    * Navigate to https://demoqa.com/
    * Click home page card named Alerts, Frame & Windows

    Scenario: Modal Dialogs
      * Click menu item called Modal Dialogs
      * Open small modal
      * Print small modal title
      * Print small modal content
      * Verify presence of the cross button
      * Close small modal
      * Wait for 5