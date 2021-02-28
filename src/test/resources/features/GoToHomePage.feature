Feature: Go to home page

  Scenario: The home page opens when the user clicks on the logo
    Given site "https://www.amazon.com" is opened
    When open Today's Deals page on the page header
    And click on the logo icon on the page header
    Then the slider is displayed on the home page