package pages.elements.menus;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class LocationMenu {
    private SelenideElement countryBox = $(Locators.get(this.getClass().getSimpleName() + ".countryBox"));
    private SelenideElement doneButton = $(Locators.get(this.getClass().getSimpleName() + ".doneButton"));

    public SelenideElement getCountryBox() {
        return countryBox;
    }

    public SelenideElement getDoneButton() {
        return doneButton;
    }
}