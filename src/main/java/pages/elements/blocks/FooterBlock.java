package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class FooterBlock {
    private SelenideElement footerBox = $(Locators.get(this.getClass().getSimpleName() + ".footerBox"));
    private SelenideElement dropdownLanguageMenu = $(Locators.get(this.getClass().getSimpleName() + ".dropdownLanguageMenu"));

    public SelenideElement getFooterBox() {
        return footerBox;
    }

    public SelenideElement getDropdownLanguageMenu() {
        return dropdownLanguageMenu;
    }
}