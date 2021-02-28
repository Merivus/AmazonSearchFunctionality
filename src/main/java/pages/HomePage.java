package pages;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement slider = $(Locators.get(this.getClass().getSimpleName() + ".slider"));

    public SelenideElement getSlider() {
        return slider;
    }
}