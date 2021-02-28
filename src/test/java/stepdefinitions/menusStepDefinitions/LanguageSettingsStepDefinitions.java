package stepdefinitions.menusStepDefinitions;

import io.cucumber.java.en.And;
import services.elementsServices.menusServices.LanguageSettingsMenuService;

public class LanguageSettingsStepDefinitions {
    private final LanguageSettingsMenuService languageSettingsMenuService;

    public LanguageSettingsStepDefinitions(LanguageSettingsMenuService languageSettingsMenuService) {
        this.languageSettingsMenuService = languageSettingsMenuService;
    }

    @And("select the Deutsch language from the Language Settings menu")
    public void selectTheDeutschLanguageFromTheLanguageSettingsMenu() {
        languageSettingsMenuService.selectSecondLanguage();
    }

    @And("click on Save Changes button on the Language Settings menu")
    public void clickOnSaveChangesButtonOnTheLanguageSettingsMenu() {
        languageSettingsMenuService.clickSaveChangesButton();
    }
}