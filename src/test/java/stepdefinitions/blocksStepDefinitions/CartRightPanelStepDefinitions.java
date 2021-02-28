package stepdefinitions.blocksStepDefinitions;

import io.cucumber.java.en.Then;
import services.elementsServices.blocksServices.CartRightPanelService;

import static org.junit.Assert.assertTrue;

public class CartRightPanelStepDefinitions {
    private CartRightPanelService cartRightPanelService;

    public CartRightPanelStepDefinitions(CartRightPanelService cartRightPanelService) {
        this.cartRightPanelService = cartRightPanelService;
    }

    @Then("is the Cart right panel displayed")
    public void isTheCartRightPanelDisplayed() {
        assertTrue(cartRightPanelService.isCartRightPanelBoxDisplayed());
    }
}
