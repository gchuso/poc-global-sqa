Feature: Registration Login
  I want to test registration and login in global SQA

	@sprint-2
  Scenario: Register new user
    Given I open the global sqa page
    When I register a new user
    Then I should see feedback 'Registration successful'
