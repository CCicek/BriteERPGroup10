@website_login
Feature: User must login to Website

  Scenario: user must login right credentials
    When user login with right "usernameSM1" and "passwordSM"
    Then use must see title as "#Inbox - Odoo"

  Scenario: user must not login with wrong credentials
    When user login with wrong "caiomilano" and "yanlis_parola_hemserim"
    Then user get error message "Wrong login/password"

  Scenario: Navigating to Website Module
    When user login with right "usernameSM1" and "passwordSM"
    When the user navigates to module "Invoicing"
    Then the system should display "Sales" subtitle

  #this test aims to login main page and then goes to website section
  # but i did not understand main function of website section guys