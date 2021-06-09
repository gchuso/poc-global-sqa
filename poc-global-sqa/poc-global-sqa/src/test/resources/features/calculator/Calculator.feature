Feature: Calculator
  I want to test the calculator

  Scenario: Calculate add
    Given I open calculator page
    When I type a value '2'
    And I type b value '2'
    Then I should see '2 + 2 = 4'
   
  Scenario: Calculate subtraction
  	Given I open calculator page
    When I type a value '2'
    And I type b value '1'
    And I select operation '-'
    Then I should see '2 - 1 = 1'