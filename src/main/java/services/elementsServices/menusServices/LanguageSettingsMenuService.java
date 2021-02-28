package services.elementsServices.menusServices;

import pages.elements.menus.LanguageSettingsMenu;

public class LanguageSettingsMenuService {
    private final LanguageSettingsMenu languageSettingsMenu;

    public LanguageSettingsMenuService(LanguageSettingsMenu languageSettingsMenu) {
        this.languageSettingsMenu = languageSettingsMenu;
    }

    public void selectSecondLanguage() {
        languageSettingsMenu.getLanguagesList().get(3).click();
    }

    public void clickSaveChangesButton() {
        languageSettingsMenu.getSaveChangesButton().click();
    }
}