Feature: Search by payee
  I want to test search by payee

  Scenario: Search by payee and see results
    Given I open the Search filter page
    When I search by payee 'House'
    And I search by account 'Cash'
    Then I should see search results '1 Cash EXPENDITURE HouseRent 1000'
    And I should not see search results '2 Bank Savings EXPENDITURE InternetBill 500'
