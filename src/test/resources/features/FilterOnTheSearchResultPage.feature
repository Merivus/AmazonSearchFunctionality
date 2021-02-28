Feature: Filter on the search result page

  Background:
    Given site "https://www.amazon.com" is opened
    And search for "Apple MacBook Pro 15" in the search field on the page header

  Scenario: Filter products by Computer RAM Capacity 32GB in the filters section
    When scroll to the filters section Computer RAM Capacity
    And click on the parameter 32GB in the filter bar
    Then the first element contains "32GB" in description on the search result page

  Scenario: Filter products by Avg. Customer Review 4Stars&Up
    When click on the parameter 4Stars&Up in the filter bar
    And hover over average user review on the on the search result page
    Then average user review value is greater than 4 and less than 5