
Feature: User must be able to use Dashboards functionality

  Scenario: User must see to dashbord
    Given user in the main page
    When user must click to "Dashboards"
    Then use must see title as "My Dashboard - Odoo"

    Scenario: User able to click My dashboard
      Given user in the main page
      When user must click to "Dashboards"
      And use must see title as "My Dashboard - Odoo"
      And able to click My Dashboard
      Then user must see in the page "Your personal dashboard is empty."