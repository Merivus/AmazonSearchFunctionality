package pages.elements.menus;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class AccountsListsMenu {
    private SelenideElement signInButton = $(Locators.get(this.getClass().getSimpleName() + ".signInButton"));
    private SelenideElement signOutText = $(Locators.get(this.getClass().getSimpleName() + ".signOutText"));

    public SelenideElement getSignInButton() {
        return signInButton;
    }

    public SelenideElement getSignOutText() {
        return signOutText;
    }
}