package services;

import pages.SearchResultPage;

public class SearchResultPageService {
    private final SearchResultPage searchResultPage;

    public SearchResultPageService(SearchResultPage searchResultPage) {
        this.searchResultPage = searchResultPage;
    }

    public void openFirstProduct() {
        searchResultPage.getFirstItem().click();
    }

    public void clickOnSortMenu() {
        searchResultPage.getSortingMenu().click();
    }

    public boolean isFilterWorked(String filter) {
        return searchResultPage.getFirstItem().getText().toUpperCase().contains(filter.toUpperCase());
    }

    public double isSortingWorked() {
        String firstPriceComma = searchResultPage.getFirstItemPrice().getText();
        String secondPriceComma = searchResultPage.getSecondItemPrice().getText();
        String[] firstPriceSplit = firstPriceComma.split(",");
        String[] secondPriceSplit = secondPriceComma.split(",");
        double firstPrice = Double.parseDouble(firstPriceSplit[0] + "." + firstPriceSplit[1]);
        double secondPrice = Double.parseDouble(secondPriceSplit[0] + "." + secondPriceSplit[1]);
        return firstPrice - secondPrice;
    }

    public String getValueOfReview() {
        String reviewText = searchResultPage.getAvgReviewOnPopover().getText();
        String[] list = reviewText.split(" ");
        return list[0];
    }

    public void hoverAvgCustomerReview() {
        searchResultPage.getAvgCustomerReviewFirst().hover();
    }
}