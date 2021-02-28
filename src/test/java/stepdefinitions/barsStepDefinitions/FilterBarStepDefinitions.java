package stepdefinitions.barsStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import services.elementsServices.barsServices.FilterBarService;

public class FilterBarStepDefinitions {
    private final FilterBarService filterBarService;

    public FilterBarStepDefinitions(FilterBarService filterBarService) {
        this.filterBarService = filterBarService;
    }

    @When("scroll to the filters section Computer RAM Capacity")
    public void scrollToTheFiltersSectionComputerRAMCapacity() {
        filterBarService.scrollToComputerRamCapacitySection32GB();
    }

    @And("click on the parameter 32GB in the filter bar")
    public void clickOnTheParameterGBInTheFilterBar() {
        filterBarService.clickOnComputerRamCapacitySection32GB();
    }

    @When("click on the parameter 4Stars&Up in the filter bar")
    public void clickOnTheParameterStarsUpInTheFilterBar() {
        filterBarService.clickOnAvgCustomerReviewFourStarsAndUp();
    }
}
