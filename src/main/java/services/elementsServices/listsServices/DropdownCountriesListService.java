package services.elementsServices.listsServices;

import pages.elements.lists.DropdownCountriesList;

public class DropdownCountriesListService {
    private final DropdownCountriesList dropdownCountriesList;

    public DropdownCountriesListService(DropdownCountriesList dropdownCountriesList) {
        this.dropdownCountriesList = dropdownCountriesList;
    }

    public void selectUnitedStates() {
        dropdownCountriesList.getUnitedStates().click();
    }
}