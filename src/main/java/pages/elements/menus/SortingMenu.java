package pages.elements.menus;

import com.codeborne.selenide.ElementsCollection;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$$;

public class SortingMenu {
    private ElementsCollection parametersList = $$(Locators.get(this.getClass().getSimpleName() + ".parametersList"));

    public ElementsCollection getParametersList() {
        return parametersList;
    }
}