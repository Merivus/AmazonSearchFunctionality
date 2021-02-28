package pages.elements.lists;

import com.codeborne.selenide.ElementsCollection;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$$;

public class ProductSubcategoriesList {
    private ElementsCollection productSubcategoriesList = $$(Locators.get(this.getClass().getSimpleName() + ".productSubcategoriesList"));

    public ElementsCollection getProductSubcategoriesList() {
        return productSubcategoriesList;
    }
}