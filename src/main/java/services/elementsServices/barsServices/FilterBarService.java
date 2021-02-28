package services.elementsServices.barsServices;

import pages.elements.bars.FilterBar;

public class FilterBarService {
    private final FilterBar filterBar;

    public FilterBarService(FilterBar filterBar) {
        this.filterBar = filterBar;
    }

    public void scrollToComputerRamCapacitySection32GB() {
        filterBar.getComputerRamCapacitySection32GB().scrollTo();
    }

    public void clickOnComputerRamCapacitySection32GB() {
        filterBar.getComputerRamCapacitySection32GB().click();
    }

    public void clickOnAvgCustomerReviewFourStarsAndUp() {
        filterBar.getReviewFourStarsAndUp().click();
    }
}