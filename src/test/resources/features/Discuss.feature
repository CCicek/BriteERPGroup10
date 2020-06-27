Feature: Discuss Module

  Background:
    Given user login with right "username" and "password"

  Scenario: Discuss Module

    Then the page should have the title "#Inbox - Odoo"

  @wip321
  Scenario: Add channel
    When user clicks the add channel button
    Then new channel should be displayed "Channel 10" under channels
@message
  Scenario Outline: Direct messages
    When user clicks direct message button sent to "<messages>"
    Then direct message should be "<displayed>"
Examples:
      | messages           | displayed          |
      | EventsCRMManager101| EventsCRMManager101 |