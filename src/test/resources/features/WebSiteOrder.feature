@website_dashboard
Feature: User enters Website section

  Scenario: Navigating to Website Module
    When user login with right "usernameSM1" and "passwordSM"
    When the user navigates to module "Website"
    Then the system should display "Dashboard" subtitle

  #Scenario: To create quatation/customer
  #  When user clicks the create button
  #  Then user fills the following blanks
  #    | Customer | Invoice Adress | Delivery Adress | Expiration Date | Pricelist | Payment Terms |