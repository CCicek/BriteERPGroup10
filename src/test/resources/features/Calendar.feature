@calendar
Feature: Calendar
  Background:
    Given user login with right "usernamePM4" and "password"
    Given use must see title as "#Inbox - Odoo"
    When the user navigates to module "Calendar"
    Then the page subTitle should be "Meetings"

@wip
  Scenario Outline: the date range
    When the user click to "<dateRange>" date range
    Then the current date should be displayed in the subTitle according to "<dateRange>"
    Examples:
      | dateRange |
      | Day       |
      | Week      |
      | Month     |