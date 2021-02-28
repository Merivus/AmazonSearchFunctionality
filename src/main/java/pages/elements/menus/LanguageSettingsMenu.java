package pages.elements.menus;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LanguageSettingsMenu {
    private ElementsCollection languagesList = $$(Locators.get(this.getClass().getSimpleName() + ".languagesList"));
    private SelenideElement saveChangesButton = $(Locators.get(this.getClass().getSimpleName() + ".saveChangesButton"));

    public ElementsCollection getLanguagesList() {
        return languagesList;
    }

    public SelenideElement getSaveChangesButton() {
        return saveChangesButton;
    }
}