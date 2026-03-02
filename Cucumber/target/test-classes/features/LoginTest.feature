Feature: Login functionality
Scenario: Login with multiple usernames

  Given user is on login page
  When user enters usernames
    | standard_user   |
    | locked_out_user |
    | problem_user    |
  Then login process should complete