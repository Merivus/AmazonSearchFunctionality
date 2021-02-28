package pages.elements.lists;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownCountriesList {
    private SelenideElement UnitedStates = $(By.xpath("//*[contains(@id,'GLUXCountryList') and contains(text(), 'United States')]"));

    public SelenideElement getUnitedStates() {
        return UnitedStates;
    }
}