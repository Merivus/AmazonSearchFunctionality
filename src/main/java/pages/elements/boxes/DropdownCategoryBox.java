package pages.elements.boxes;

import com.codeborne.selenide.ElementsCollection;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$$;

public class DropdownCategoryBox {
    private ElementsCollection dropdownCategoriesList = $$(Locators.get(this.getClass().getSimpleName() + ".dropdownCategoriesList"));

    public ElementsCollection getDropdownCategoriesList() {
        return dropdownCategoriesList;
    }
}