
Feature: User must login

  Scenario: user must login right credentials
    When user login with right "usernameSM1" and "passwordSM"
    Then use must see title as "#Inbox - Odoo"

  Scenario: user must not login with wrong credentials
      When user login with wrong "wronguser" and "password"
      Then user get error message "Wrong login/password"