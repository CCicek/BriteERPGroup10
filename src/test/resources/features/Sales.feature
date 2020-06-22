Feature: Sales Modules Behaviours

  Scenario: Navigating to Website Module
    When user login with right "usernameSM1" and "passwordSM"
    When the user navigates to module "Invoicing"
    Then the system should display "Sales" subtitle

  Scenario: To create quatation/customer
    When user clicks the create button
    Then user fills the following blanks
      | Customer | Invoice Adress | Delivery Adress | Expiration Date | Pricelist | Payment Terms |


