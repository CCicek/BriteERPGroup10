
Feature: Invoicing Functionality

  Background:
    When user login with right "usernameSM1" and "passwordSM"
    When the user navigates to module "Invoicing"


  Scenario: Navigating to Invoicing Module
    Then the system should display "Customer Invoices" subtitle

  @wip
  Scenario Outline: Navigating to <subTabName> tab under <tabName>
    When the user navigates to tab "<tabName>" and "<subTabName>"
    Then the system should display "<subTabName>" subtitle
    Examples:
      | subTabName            | tabName   |
      | Customer Invoices     | Sales     |
      | Customer Credit Notes | Sales     |
      | Payments              | Sales     |
      | Customers             | Sales     |
      | Sellable Products     | Sales     |
      | Vendor Bills          | Purchases |
      | Vendor Credit Notes   | Purchases |
      | Payments              | Purchases |
      | Vendors               | Purchases |
      | Purchasable Products  | Purchases |

