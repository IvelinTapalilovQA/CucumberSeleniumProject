@LogOut
Feature: Test logOut
  As a user,
  I want to be able to log out from my account

  Background:
    Given The user access practice.automationtesting homepage
    And  The user cancel the personal data modal window
    And  The user clicks on my account button
    And  The user log in to account


  Scenario:  The user would like to use the logout button to exit
    When The user clicks on sign out button
    Then The user should be logged out and redirected to the login and registration section