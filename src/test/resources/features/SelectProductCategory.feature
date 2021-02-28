Feature: Select product category

  Background:
    Given site "https://www.amazon.com" is opened

  Scenario: Select product category using dropdown menu on the header
    When click on the dropdown box
    And click on the product category number 3 on the dropdown list
    Then the name of the third category "Automotive" is displayed in the title of the dropdown box

  Scenario: Select product category using left hand navbar on the header
    When open the left hand navbar on the page header
    And click on the category Electronics on the left hand navbar
    Then the name of the category "Electronics" is displayed in the title of the subcategories list