Feature: Search product

  Background:
    Given site "https://www.amazon.com" is opened

  Scenario: Search for product using the search field
    When search for "Apple MacBook Pro 15" in the search field on the page header
    And open the first result on the search result page
    Then title is visible on the product card page

  Scenario: Search for product using left hand navbar
    When open the left hand navbar on the page header
    And click on the category Electronics on the left hand navbar
    And click on the Accessories&Supplies in the list of subcategories of the Electronics category
    And open the first result on the search result page
    Then title is visible on the product card page


