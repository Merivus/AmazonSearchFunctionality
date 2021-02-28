package services.elementsServices.listsServices;

import pages.elements.lists.DropdownLanguagesList;

public class DropdownLanguageListService {
    private final DropdownLanguagesList dropdownLanguagesList;

    public DropdownLanguageListService(DropdownLanguagesList dropdownLanguagesListService) {
        this.dropdownLanguagesList = dropdownLanguagesListService;
    }

    public void selectSpanishInLanguageList() {
        dropdownLanguagesList.getLanguagesCollection().get(0).click();
    }

    public boolean isSpanishInLanguageListSelected() {
        return dropdownLanguagesList.getLanguagesCollection().get(0).isSelected();
    }
}