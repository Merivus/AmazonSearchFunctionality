package services.elementsServices.menusServices;

import pages.elements.menus.SortingMenu;

public class SortingMenuService {
    private final SortingMenu sortingMenu;

    public SortingMenuService(SortingMenu sortingMenu) {
        this.sortingMenu = sortingMenu;
    }

    public void selectPriceHighToLowParameter() {
        sortingMenu.getParametersList().get(2).click();
    }
}