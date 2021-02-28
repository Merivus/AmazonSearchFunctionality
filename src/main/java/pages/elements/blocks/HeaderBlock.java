package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class HeaderBlock {
    private SelenideElement accountsAndLists = $(Locators.get(this.getClass().getSimpleName() + ".accountsAndLists"));
    private SelenideElement searchField = $(Locators.get(this.getClass().getSimpleName() + ".searchField"));
    private SelenideElement leftHandNavbarGamburgerMenu = $(Locators.get(this.getClass().getSimpleName() + ".leftHandNavbarGamburgerMenu"));
    private SelenideElement todaysDealsField = $(Locators.get(this.getClass().getSimpleName() + ".todaysDealsField"));
    private SelenideElement logotype = $(Locators.get(this.getClass().getSimpleName() + ".logotype"));
    private SelenideElement dropdownCategoryBox = $(Locators.get(this.getClass().getSimpleName() + ".dropdownCategoryBox"));
    private SelenideElement returnsAndOrdersField = $(Locators.get(this.getClass().getSimpleName() + ".returnsAndOrdersField"));
    private SelenideElement dropdownLanguageMenu = $(Locators.get(this.getClass().getSimpleName() + ".dropdownLanguageMenu"));
    private SelenideElement location = $(Locators.get(this.getClass().getSimpleName() + ".location"));

    public SelenideElement getAccountsAndLists() {
        return accountsAndLists;
    }

    public SelenideElement getSearchField() {
        return searchField;
    }

    public SelenideElement getLeftHandNavbarGamburgerMenu() {
        return leftHandNavbarGamburgerMenu;
    }

    public SelenideElement getTodaysDealsField() {
        return todaysDealsField;
    }

    public SelenideElement getLogotype() {
        return logotype;
    }

    public SelenideElement getDropdownCategoryBox() {
        return dropdownCategoryBox;
    }

    public SelenideElement getReturnsAndOrdersField() {
        return returnsAndOrdersField;
    }

    public SelenideElement getDropdownLanguageMenu() {
        return dropdownLanguageMenu;
    }

    public SelenideElement getLocation() {
        return location;
    }
}