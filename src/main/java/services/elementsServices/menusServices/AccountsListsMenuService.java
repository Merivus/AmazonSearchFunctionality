package services.elementsServices.menusServices;

import pages.elements.menus.AccountsListsMenu;

public class AccountsListsMenuService {
    private final AccountsListsMenu accountsListsMenu;

    public AccountsListsMenuService(AccountsListsMenu accountsListsMenu) {
        this.accountsListsMenu = accountsListsMenu;
    }

    public void clickOnSignInButton() {
        accountsListsMenu.getSignInButton().click();
    }

    public String seeSignOutText() {
        return accountsListsMenu.getSignOutText().getText();
    }
}