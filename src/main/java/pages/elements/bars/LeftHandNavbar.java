package pages.elements.bars;

import com.codeborne.selenide.ElementsCollection;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$$;

public class LeftHandNavbar {
    private ElementsCollection productCategoriesList = $$(Locators.get(this.getClass().getSimpleName() + ".productCategoriesList"));

    public ElementsCollection getProductCategoriesList() {
        return productCategoriesList;
    }
}