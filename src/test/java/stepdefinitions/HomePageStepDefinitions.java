package stepdefinitions;

import io.cucumber.java.en.Then;
import services.HomePageService;

import static org.junit.Assert.assertTrue;

public class HomePageStepDefinitions {
    private final HomePageService homePageService;

    public HomePageStepDefinitions(HomePageService homePageService) {
        this.homePageService = homePageService;
    }

    @Then("the slider is displayed on the home page")
    public void theSliderIsDisplayedOnTheHomePage() {
        assertTrue(homePageService.isSliderDisplayed());
    }
}