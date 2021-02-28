package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.SearchResultPageService;

import static org.junit.Assert.assertTrue;

public class SearchResultStepDefinitions {
    private final SearchResultPageService searchResultPageService;

    public SearchResultStepDefinitions(SearchResultPageService searchResultPageService) {
        this.searchResultPageService = searchResultPageService;
    }

    @And("open the first result on the search result page")
    public void openTheFirstResultOnTheSearchResultPageUsingTheSearchField() {
        searchResultPageService.openFirstProduct();
    }

    @Then("the first element contains {string} in description on the search result page")
    public void theFirstElementIsDisplayedAccordingToTheFilterOnTheSearchResultPage(String arg0) {
        assertTrue(searchResultPageService.isFilterWorked(arg0));
    }

    @When("click on the sorting menu on the search result page")
    public void clickOnTheSortingMenuOnTheSearchResultPageUsingTheSearchField() {
        searchResultPageService.clickOnSortMenu();
    }

    @Then("the first element is displayed according to the sorting on the search result page")
    public void theFirstElementIsDisplayedAccordingToTheSortingOnTheSearchResultPageUsingTheSearchField() {
        assertTrue(searchResultPageService.isSortingWorked() > 0);
    }

    @And("hover over average user review on the on the search result page")
    public void hoverOverAverageUserReviewOnTheOnTheSearchResultPageUsingTheSearchField() {
        searchResultPageService.hoverAvgCustomerReview();
    }

    @Then("average user review value is greater than {int} and less than {int}")
    public void averageUserReviewValueIsGreaterThanAndLessThan(int arg0, int arg1) {
        assertTrue(Double.parseDouble(searchResultPageService.getValueOfReview()) > arg0
                && Double.parseDouble(searchResultPageService.getValueOfReview()) <= arg1);
    }
}
