@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user choose Gender
    And user shall write valid first name
    And user shall write valid last name
    And user shall select valid birth date
    And user shall write valid email address
    And user shall write valid password
    And user shall write again the same valid password
    And user shall clicks on register button
    Then success message shall be displayed