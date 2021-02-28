package stepdefinitions.blocksStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import services.elementsServices.blocksServices.FooterBlockService;

import static org.junit.Assert.assertTrue;

public class FooterStepDefinitions {
    private final FooterBlockService footerBlockService;

    public FooterStepDefinitions(FooterBlockService footerBlockService) {
        this.footerBlockService = footerBlockService;
    }

    @When("scroll to page footer")
    public void scrollToPageFooter() {
        footerBlockService.scrollToFooter();
    }

    @And("click on the dropdown language menu on the site footer")
    public void clickOnTheDropdownLanguageMenuOnTheSiteFooter() {
        footerBlockService.clickOnDropdownLanguageMenu();
    }

    @Then("the {string} is displayed in the language menu on the site footer")
    public void theIsDisplayedInTheLanguageMenuOnTheSiteFooter(String arg0) {
        assertTrue(footerBlockService.getTextDropdownLanguageMenu().contains(arg0.toUpperCase()));
    }
}
