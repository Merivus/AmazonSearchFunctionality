package pages.elements.blocks;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class CartRightPanel {
    private SelenideElement cartRightPanelBox = $(Locators.get(this.getClass().getSimpleName() + ".cartRightPanelBox"));
    private SelenideElement closeRightPanel = $(Locators.get(this.getClass().getSimpleName() + ".closeRightPanel"));

    public SelenideElement getCartRightPanelBox() {
        return cartRightPanelBox;
    }

    public SelenideElement getCloseRightPanel() {
        return closeRightPanel;
    }
}
