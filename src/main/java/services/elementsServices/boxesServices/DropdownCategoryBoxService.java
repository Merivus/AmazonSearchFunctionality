package services.elementsServices.boxesServices;

import pages.elements.boxes.DropdownCategoryBox;

public class DropdownCategoryBoxService {
    private final DropdownCategoryBox dropdownCategoryBox;

    public DropdownCategoryBoxService(DropdownCategoryBox dropdownCategoryBox) {
        this.dropdownCategoryBox = dropdownCategoryBox;
    }

    public void clickOnThirdCategory() {
        dropdownCategoryBox.getDropdownCategoriesList().get(2).click();
    }
}