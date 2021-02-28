package stepdefinitions.boxesStepDefinitions;

import io.cucumber.java.en.Then;
import services.elementsServices.boxesServices.DropdownCategoryBoxService;

public class DropdownCategoryBoxStepDefinitions {
    private final DropdownCategoryBoxService dropdownCategoryBoxService;

    public DropdownCategoryBoxStepDefinitions(DropdownCategoryBoxService dropdownCategoryBoxService) {
        this.dropdownCategoryBoxService = dropdownCategoryBoxService;
    }

    @Then("click on the product category number 3 on the dropdown list")
    public void theDropdownListIsDisplayed() {
        dropdownCategoryBoxService.clickOnThirdCategory();
    }
}