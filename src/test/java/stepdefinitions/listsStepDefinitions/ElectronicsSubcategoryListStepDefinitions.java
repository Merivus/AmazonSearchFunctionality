package stepdefinitions.listsStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.elementsServices.listsServices.ProductSubcategoriesListService;

import static org.junit.Assert.assertEquals;


public class ElectronicsSubcategoryListStepDefinitions {
    private final ProductSubcategoriesListService productSubcategoriesListService;

    public ElectronicsSubcategoryListStepDefinitions(ProductSubcategoriesListService productSubcategoriesListService) {
        this.productSubcategoriesListService = productSubcategoriesListService;
    }

    @And("click on the Accessories&Supplies in the list of subcategories of the Electronics category")
    public void clickOnTheAccessoriesSuppliesInTheListOfSubcategoriesOfTheElectronicsCategory() {
        productSubcategoriesListService.clickFirstSubcategory();
    }

    @Then("the name of the category {string} is displayed in the title of the subcategories list")
    public void theNameOfTheCategoryElectronicsIsDisplayedInTheTitleOfTheSubcategoriesList(String arg0) {
        assertEquals(arg0.toUpperCase(), productSubcategoriesListService.getTitleNameOfSubcategoryList().toUpperCase());
    }
}