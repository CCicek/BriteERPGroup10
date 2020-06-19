Feature: Invoicing Functionality

  @www
  Scenario: Navigating to Invoicing Module
    When user login with right "usernameSM1" and "passwordSM"
    When the user navigates to module "Invoicing"
    Then the system should display "Customer Invoices" subtitle



