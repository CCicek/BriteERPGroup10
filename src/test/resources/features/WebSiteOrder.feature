@website_dashboard
Feature: User enters Website section

  Scenario: Navigating to Website Module
    When user login with right "usernameSM1" and "passwordSM"
    When the user navigates to module "Website"
    Then the system should display "Dashboard" subtitle

  # here we go to our project main page then go to webpage section...
  # then we see subtitle..