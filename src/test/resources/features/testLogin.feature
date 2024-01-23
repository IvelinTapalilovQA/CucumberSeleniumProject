@Login
Feature: Login
  As a user,
  I want to be able to log in to my account

  Background:
    Given The user access practice.automationtesting homepage
    And   The user cancel the personal data modal window
    And   The user clicks on my account button

  Scenario: The user would like to use the correct username and password, which were previously used, to log in to his dashboard.
     When  The user enters a valid email into the login section
     And   The user enters a valid password into the login section
     And   The user clicks on login button
     Then  The user should be presented with a successful login message