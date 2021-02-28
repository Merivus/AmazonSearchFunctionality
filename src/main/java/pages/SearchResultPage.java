package pages;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    private SelenideElement firstItem = $(By.xpath("//div[@data-index = \"1\" and contains(@data-asin, 'B')]//h2/a"));
    private SelenideElement firstItemPrice = $(By.xpath("//div[@data-index = \"1\" and contains(@data-asin, 'B')]//*[@class = \"a-price-whole\"]"));
    private SelenideElement secondItemPrice = $(By.xpath("//div[@data-index = \"2\" and contains(@data-asin, 'B')]//*[@class = \"a-price-whole\"]"));

    private SelenideElement sortingMenu = $(Locators.get(this.getClass().getSimpleName() + ".sortingMenu"));

    private SelenideElement avgCustomerReviewFirst = $(By.xpath("//div[@data-index = \"1\" and contains(@data-asin, 'B')]//span[@class =\"a-icon-alt\"]"));
    private SelenideElement avgReviewOnPopover = $(Locators.get(this.getClass().getSimpleName() + ".avgReviewOnPopover"));


    public SelenideElement getFirstItem() {
        return firstItem;
    }

    public SelenideElement getSortingMenu() {
        return sortingMenu;
    }

    public SelenideElement getAvgCustomerReviewFirst() {
        return avgCustomerReviewFirst;
    }

    public SelenideElement getFirstItemPrice() {
        return firstItemPrice;
    }

    public SelenideElement getSecondItemPrice() {
        return secondItemPrice;
    }

    public SelenideElement getAvgReviewOnPopover() {
        return avgReviewOnPopover;
    }
}