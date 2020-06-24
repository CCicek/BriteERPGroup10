
Feature:  Leaves functionality

  Background:
    When the user login with "posmanager12@info.com" and "posmanager"
    When  the user navigates to module "Leaves"

  Scenario: Navigating to Leaves Module
    Then the system should display "All Leaves (June 2020)" subtitle

  Scenario Outline:  Navigating to <subTabName> tab under <tabName>
    When the user navigates to tab "<tabName>" and "<subTabName>"
    Then the system should display "<subTabName>" subtitle
    Examples:
      | subTabName           | tabName           |
      | Leaves Summary       | My Leaves         |
      | Leaves Request       | My Leaves         |
      | Allocation Request   | My Leaves         |
      | Leaves               | Leaves to Approve |
      | Leaves Allocation    | Leaves to Approve |
      | Leaves Details       | Reporting         |
      | Leaves               | Reporting         |
      | Leaves by Department | Reporting         |
@lvs
  Scenario: Creating a new Leaves
    When the user creates a new Leaves using following info
      | Description | Leaves              |
      | Leave Type  | Unpaid              |
      | Duration    | 06/30/2020 18:13:42 |
      | Duration    | 07/01/2020 02:36:18 |
      | Employee    | David Samson        |
      | Department  | CRM                 |
    Then the user should  see the " David Samson on Unpaid : 2.00 day(s)" message
