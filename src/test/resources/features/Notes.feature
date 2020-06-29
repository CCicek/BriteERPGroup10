Feature: User must use notes functionality

  Background:
    Given user in the main page
    And user must click to "Notes"

  Scenario: User must able to create note
    When user click to create button
    And user able to write "WritingTest1" in writepad
    And user able to click save
    Then user able to see "WritingTest1" in page

  Scenario: user must be able to upload file
    When user able to user click to import button
    And user able to click to Load file
    Then user able to upload the file

  @www
  Scenario: user must be able to edit notes
    When user click to create button
    And user able to write "EditTest" in writepad
    And user able to click save
    Then user able to see "EditTest" in page
    When user able to click edit
    And user able to write "AddControlPoint1" in writepad
    And user able to click save
    Then user able to see "EditTestAddControlPoint1" in page



