package services;

import pages.HomePage;

public class HomePageService {
    private final HomePage homePage;

    public HomePageService(HomePage homePage) {
        this.homePage = homePage;
    }

    public boolean isSliderDisplayed() {
        return homePage.getSlider().isDisplayed();
    }
}