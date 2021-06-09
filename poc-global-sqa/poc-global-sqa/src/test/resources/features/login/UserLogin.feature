Feature: User Login
  I want to test user login

  Scenario: User login with invalid credentials
    Given I open login page
    When I type invalid credentials
    Then I should see the feedback 'Username or password is incorrect'