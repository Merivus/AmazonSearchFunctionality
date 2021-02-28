package pages.elements.bars;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class FilterBar {
    private SelenideElement computerRamCapacitySection32GB = $(Locators.get(this.getClass().getSimpleName() + ".computerRamCapacitySection32GB"));
    private SelenideElement reviewFourStarsAndUp = $(Locators.get(this.getClass().getSimpleName() + ".reviewFourStarsAndUp"));

    public SelenideElement getComputerRamCapacitySection32GB() {
        return computerRamCapacitySection32GB;
    }

    public SelenideElement getReviewFourStarsAndUp() {
        return reviewFourStarsAndUp;
    }
}