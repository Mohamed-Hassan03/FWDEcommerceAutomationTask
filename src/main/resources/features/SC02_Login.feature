@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with "valid" "test101@example.com" and "testpassword101"
    And user press on login button
    Then user shall be logged in to the system successfully


  Scenario: user could login with invalid email and password
    Given user go to login page
    When user login with "invalid" "wrong@example.com" and "P@ssw0rd"
    And user press on login button
    Then user could not login to the system