
Feature: User enters Website section
  @website_dashboard
  Scenario: Navigating to Website Module
    When user login with right "usernamePM3" and "password"
    When the user navigates to module "Website"
    Then the system should display "Dashboard" subtitle

  # here we go to our project main page then go to webpage section...
  # then we see subtitle..

@website_modules
  Scenario Outline: Navigating to <subTabName> tab under <tabName>
    When the user navigates to tab "<tabName>" and "<subTabName>"
    Then the system should display "<subTabName>" subtitle
    Examples:
      | subTabName            | tabName   |
      | Website               | Last Week     |
      | Website               | Last Month |
      | Website               | Last Year     |
