package stepdefinitions.blocksStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.elementsServices.blocksServices.HeaderBlockService;

import static org.junit.Assert.assertEquals;

public class HeaderStepDefinitions {private final HeaderBlockService headerBlockService;

    public HeaderStepDefinitions(HeaderBlockService headerBlockService) {
        this.headerBlockService = headerBlockService;
    }

    @When("hover over the Account&Lists on the page header")
    public void hoverHeCursorOnAccountAndListsOnTheHomePage() {
        headerBlockService.hoverOverAccountAndLists();
    }

    @When("open the left hand navbar on the page header")
    public void openTheLeftHandNavbarOnTheHomePage() {
        headerBlockService.clickLeftHandNavbarGamburgerMenu();
    }

    @When("open Today's Deals page on the page header")
    public void openTodaySDealsPageOnThePageHeader() {
        headerBlockService.clickTodaysDealsField();
    }

    @And("click on the logo icon on the page header")
    public void clickOnTheLogoIconOnThePageHeader() {
        headerBlockService.clickLogotype();
    }

    @When("click on the dropdown box")
    public void clickOnTheDropdownBox() {
        headerBlockService.clickDropdownCategoryBox();
    }

    @Then("the name of the third category {string} is displayed in the title of the dropdown box")
    public void theNameOfTheSelectedCategoryIsDisplayedInTheTitleOfTheDropDownBox(String arg0) {
        assertEquals(arg0.toUpperCase(), headerBlockService.getTheTitleOfTheDropdownBox().toUpperCase());
    }

    @When("click on the Returns&Orders area on the header")
    public void clickOnTheReturnsOrdersAreaOnTheHeader() {
        headerBlockService.clickReturnsAndOrdersField();
    }

    @And("search for {string} in the search field on the page header")
    public void searchForInTheSearchFieldOnThePageHeader(String arg0) {
        headerBlockService.typeAndSearchProduct(arg0);
    }

    @When("hover over the dropdown language menu on the site header")
    public void hoverOverTheDropdownLanguageMenuOnTheSiteHeader() {
        headerBlockService.hoverOverDropdownLanguageMenu();
    }

    @When("click on Location Box on the page header")
    public void clickOnLocationBoxOnThePageHeader() {
        headerBlockService.clickOnLocation();
    }
}