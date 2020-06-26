#caio ragazzi..come stai? come e la vita?
#in this feature file, we test website order section

Feature: WebSite module testing part2
  #this part describes to login system and goes to website modules
  Background:
    Given user login with right "usernamePM3" and "password"
    When the user navigates to the module. "Orders"
  @wip12

  Scenario: To create Website/order
    And user clicks the create button.
    And user fills the following blanks.



