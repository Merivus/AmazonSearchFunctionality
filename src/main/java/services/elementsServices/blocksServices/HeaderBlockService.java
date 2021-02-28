package services.elementsServices.blocksServices;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.elements.blocks.HeaderBlock;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HeaderBlockService {
    private final HeaderBlock headerBlock;

    public HeaderBlockService(HeaderBlock headerBlock) {
        this.headerBlock = headerBlock;
    }

    public void hoverOverAccountAndLists() {
        headerBlock.getAccountsAndLists().should(Condition.visible).hover();
    }

    public void typeAndSearchProduct(String productName) {
        Actions builder = new Actions(getWebDriver());
        builder.sendKeys(headerBlock.getSearchField(), productName)
                .sendKeys(Keys.RETURN).build().perform();
    }

    public void clickLeftHandNavbarGamburgerMenu() {
        headerBlock.getLeftHandNavbarGamburgerMenu().click();
    }

    public void clickTodaysDealsField() {
        headerBlock.getTodaysDealsField().click();
    }

    public void clickLogotype() {
        headerBlock.getLogotype().click();
    }

    public void clickDropdownCategoryBox() {
        headerBlock.getDropdownCategoryBox().click();
    }

    public String getTheTitleOfTheDropdownBox() {
        return headerBlock.getDropdownCategoryBox().getText();
    }

    public void clickReturnsAndOrdersField() {
        headerBlock.getReturnsAndOrdersField().click();
    }

    public void hoverOverDropdownLanguageMenu() {
        headerBlock.getDropdownLanguageMenu().hover();
    }

    public void clickOnLocation() {
        headerBlock.getLocation().click();
    }
}