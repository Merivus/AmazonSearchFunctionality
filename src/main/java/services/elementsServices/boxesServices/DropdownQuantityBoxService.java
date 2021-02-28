package services.elementsServices.boxesServices;

import pages.elements.boxes.DropdownQuantityBox;

public class DropdownQuantityBoxService {
    private final DropdownQuantityBox dropdownQuantityBox;

    public DropdownQuantityBoxService(DropdownQuantityBox dropdownQuantityBox) {
        this.dropdownQuantityBox = dropdownQuantityBox;
    }

    public void selectTwoInTheDropdownQuantityList() {
        dropdownQuantityBox.getDropdownQuantityListTwo().click();
    }
}
