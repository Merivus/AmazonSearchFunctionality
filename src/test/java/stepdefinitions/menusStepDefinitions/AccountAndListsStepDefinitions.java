package stepdefinitions.menusStepDefinitions;

import io.cucumber.java.en.And;
import services.elementsServices.menusServices.AccountsListsMenuService;

public class AccountAndListsStepDefinitions {
    private final AccountsListsMenuService accountsListsMenuService;

    public AccountAndListsStepDefinitions(AccountsListsMenuService accountsListsMenuService) {
        this.accountsListsMenuService = accountsListsMenuService;
    }

    @And("click on the Sign in button on the Account and Lists menu")
    public void clickOnSignIn() {
        accountsListsMenuService.clickOnSignInButton();
    }
}