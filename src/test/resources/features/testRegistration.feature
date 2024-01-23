@Registration
Feature: Test registration
  As a user,
  I want to be able to register on the website

  Background:
    Given The user access practice.automationtesting homepage
    And   The user cancel the personal data modal window
    And   The user clicks on my account button


  Scenario: The user would like to register a new username using an acceptable email and password
      When The user enters a valid email address in the registration section
      And  The user enters a valid password in the registration section
      And  The user clicks on register button
      Then The user should be presented with a successful registration message
