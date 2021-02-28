package stepdefinitions.barsStepDefinitions;

import io.cucumber.java.en.And;
import services.elementsServices.barsServices.LeftHandNavbarService;

public class LeftHandNavBarStepDefinitions {
    private final LeftHandNavbarService leftHandNavbarService;

    public LeftHandNavBarStepDefinitions(LeftHandNavbarService leftHandNavbarService) {
        this.leftHandNavbarService = leftHandNavbarService;
    }

    @And("click on the category Electronics on the left hand navbar")
    public void clickOnTheCategoryElectronicsTheLeftHandNavbar() {
        leftHandNavbarService.clickFirstCategory();
    }

}

