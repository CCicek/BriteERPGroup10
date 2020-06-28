@sales
Feature: Sales Modules Behaviours


  Background:
    Given user login with right "usernameSM1" and "passwordSM"
    When the user navigates to the module "Sales"

    @while
  Scenario: Navigating to Sales Module
    Then the system should display the "Quotations" subtitle


  @sales
  Scenario: To create quatation/customer
    And user clicks the create button
    And user fills the following blanks
      | Customer | Invoice Adress | Delivery Adress | Expiration Date | Pricelist | Payment Terms |
      | X        | Y              | Z               | A               | B         | C             |

    Then user get the error message "invalid"

  Scenario: Navigates To Sales
    Then user click the "SO126"

