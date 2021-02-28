package services.elementsServices.blocksServices;

import pages.elements.blocks.CartRightPanel;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class CartRightPanelService {
    private final CartRightPanel cartRightPanel;

    public CartRightPanelService(CartRightPanel cartRightPanel) {
        this.cartRightPanel = cartRightPanel;
    }

    public boolean isCartRightPanelBoxDisplayed() {
        if (cartRightPanel.getCloseRightPanel().exists()) {
            cartRightPanel.getCloseRightPanel().click();
            getWebDriver().navigate().refresh();
        }
        return cartRightPanel.getCartRightPanelBox().isDisplayed();
    }

}