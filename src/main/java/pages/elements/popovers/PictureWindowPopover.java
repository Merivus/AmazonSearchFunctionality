package pages.elements.popovers;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PictureWindowPopover {
    private SelenideElement activePicture = $(Locators.get(this.getClass().getSimpleName() + ".activePicture"));
    private SelenideElement zoomPicture = $(By.xpath("//*[@id=\"ivLargeImage\" and contains(@style, 'zoom-out')]"));

    public SelenideElement getActivePicture() {
        return activePicture;
    }

    public SelenideElement getZoomPicture() {
        return zoomPicture;
    }
}