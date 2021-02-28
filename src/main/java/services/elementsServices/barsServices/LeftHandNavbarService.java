package services.elementsServices.barsServices;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.elements.bars.LeftHandNavbar;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LeftHandNavbarService {
    private final LeftHandNavbar leftHandNavbar;

    public LeftHandNavbarService(LeftHandNavbar leftHandNavbar) {
        this.leftHandNavbar = leftHandNavbar;
    }

    public void clickFirstCategory() {
        WebDriverWait explicitWait = new WebDriverWait(getWebDriver(), 10);
        leftHandNavbar.getProductCategoriesList().get(6).hover().click();
    }
}