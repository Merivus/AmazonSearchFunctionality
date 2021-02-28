package services.elementsServices.menusServices;

import org.openqa.selenium.interactions.Actions;
import pages.elements.menus.LocationMenu;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LocationMenuService {
    private final LocationMenu locationMenu;

    public LocationMenuService(LocationMenu locationMenu) {
        this.locationMenu = locationMenu;
    }

    public void clickOnCountryList() {
        Actions builder = new Actions(getWebDriver());
        builder.moveToElement(locationMenu.getCountryBox()).click(locationMenu.getCountryBox());
        builder.perform();
    }

    public String getCountryBoxText() {
        return locationMenu.getCountryBox().getText();
    }

    public void clickOnDoneButton() {
        Actions builder = new Actions(getWebDriver());
        builder.click(locationMenu.getDoneButton()).build().perform();
        getWebDriver().navigate().refresh();
    }
}