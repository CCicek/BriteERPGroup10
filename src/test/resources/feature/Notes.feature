
Feature: User must use notes functionality

  Background:
    When user in the main page
    Then user must click to "Notes"

  Scenario: User must able to create note
    And user click to create button
    Then user able to write "WritingTest1" in writepad
    And user able to click save
    Given user able to see "WritingTest1" in page