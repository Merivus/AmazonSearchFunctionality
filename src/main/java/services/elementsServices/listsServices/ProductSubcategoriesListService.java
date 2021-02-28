package services.elementsServices.listsServices;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.elements.lists.ProductSubcategoriesList;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ProductSubcategoriesListService {
    private final ProductSubcategoriesList productSubcategoriesList;

    public ProductSubcategoriesListService(ProductSubcategoriesList productSubcategoriesList) {
        this.productSubcategoriesList = productSubcategoriesList;
    }

    public void clickFirstSubcategory() {
        WebDriverWait explicitWait = new WebDriverWait(getWebDriver(), 10);
        productSubcategoriesList.getProductSubcategoriesList().get(2).click();
    }

    public String getTitleNameOfSubcategoryList() {
        return productSubcategoriesList.getProductSubcategoriesList().get(1).getText();
    }
}