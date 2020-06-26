
Feature: Discuss Module

  Background:
    Given user login with right "username" and "password"

  Scenario: Discuss Module

   Then the page should have the title "#Inbox - Odoo"
@wip
 Scenario: Add channel
   When user clicks the add channel button
   Then new channel should be displayed "Channel 10" under channels