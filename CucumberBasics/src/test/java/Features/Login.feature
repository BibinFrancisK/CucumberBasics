Feature: Login Feature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following details for login
      | userName | Password |
      | admin    | adminpwd |
    And I click login button
    Then I should see the user form page