Feature: Login Test
Scenario Outline: Login with multiple users
Given the user is on login page
    When the user enters "<username>" and "<password>"
    Then the login result should be "<result>"

  Examples:
    | username        | password      | result  |
    | standard_user   | secret_sauce  | success |
    | locked_out_user | secret_sauce  | error   |

