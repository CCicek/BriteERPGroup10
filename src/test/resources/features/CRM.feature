Feature: CRM Functionality
  Background:
    When user login with right "usernamePM1" and "password"
    When the user navigates to module "CRM"

    @ted
  Scenario: Navigating to CRM Module
    Then the system should display "Pipeline" subtitle

  Scenario Outline: Navigating to <subTabName> tab under <tabName>
    When the user navigates to tab "<tabName>" and "<subTabName>"
    Then the system should display "<subTabName>" subtitle
    Examples:
      | subTabName            | tabName   |
      | Pipeline              | Pipeline  |
      | Quotations            | Pipeline  |


