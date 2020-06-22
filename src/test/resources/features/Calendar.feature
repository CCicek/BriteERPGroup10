@calendar
Feature: Calendar
  Background:
    Given user login with right "usernamePM4" and "password"
    Given use must see title as "#Inbox - Odoo"


  Scenario: the user should be able to enter calendar module
    When the user navigates to module "Calendar"
    Then the page subTitle should be "Meetings"
