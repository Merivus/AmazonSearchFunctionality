package stepdefinitions.boxesStepDefinitions;

import io.cucumber.java.en.And;
import services.elementsServices.boxesServices.DropdownQuantityBoxService;

public class DropdownQuantityStepDefinitions {
    private final DropdownQuantityBoxService dropdownQuantityBoxService;

    public DropdownQuantityStepDefinitions(DropdownQuantityBoxService dropdownQuantityBoxServices) {
        this.dropdownQuantityBoxService = dropdownQuantityBoxServices;
    }

    @And("select choose an amount equal to two in the dropdown quantity list")
    public void selectChooseAnAmountEqualToTwoInTheDropdownQuantityList() {
        dropdownQuantityBoxService.selectTwoInTheDropdownQuantityList();
    }
}