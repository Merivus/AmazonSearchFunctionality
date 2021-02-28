package stepdefinitions.menusStepDefinitions;

import io.cucumber.java.en.And;
import services.elementsServices.menusServices.SortingMenuService;

public class SortingMenuStepDefinitions {
    private final SortingMenuService sortingMenuService;

    public SortingMenuStepDefinitions(SortingMenuService sortingMenuService) {
        this.sortingMenuService = sortingMenuService;
    }

    @And("click on the Price: High to Low parameter on the sorting menu")
    public void clickOnThePriceHighToLowParameterOnTheSortingMenu() {
        sortingMenuService.selectPriceHighToLowParameter();
    }
}