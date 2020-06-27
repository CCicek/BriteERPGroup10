#this page is prepared for testing website module

Feature: Website module testing

#this part describes to login system and goes to website modules
  Background:
    Given user login with right "usernamePM3" and "password"
    When the user navigates to the module. "Website"
#with this scenario we navigate to website module
 @wip
  Scenario: Navigating to Website Module
    Then the system should display the "Dashboard" subtitle


  Scenario: Navigating to Last Week Button
    When the user navigates to the button "Last Week"
    Then the system should display the "SALES SINCE LAST WEEK" table title

  Scenario Outline: Clicking to <table button>
    When user click "<table button>"
    Then the table title should contain "<table button>"

    Examples:
      | table button |
      | Last Week    |
      | Last Month   |
      | Last Year    |