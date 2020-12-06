Feature: Login Functionality

  Scenario: Login with valide username and password

    Given Navigate to basqar
    When Enter username and password and click Login button
    Then user should login successfully