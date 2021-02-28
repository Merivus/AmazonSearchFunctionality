package pages.elements.lists;

import com.codeborne.selenide.ElementsCollection;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$$;

public class DropdownLanguagesList {
    private ElementsCollection languagesCollection = $$(Locators.get(this.getClass().getSimpleName() + ".languagesCollection"));

    public ElementsCollection getLanguagesCollection() {
        return languagesCollection;
    }
}