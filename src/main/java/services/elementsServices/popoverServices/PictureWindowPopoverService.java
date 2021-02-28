package services.elementsServices.popoverServices;


import com.codeborne.selenide.Condition;
import pages.elements.popovers.PictureWindowPopover;

public class PictureWindowPopoverService {
    private final PictureWindowPopover pictureWindowPopover;

    public PictureWindowPopoverService(PictureWindowPopover pictureWindowPopover) {
        this.pictureWindowPopover = pictureWindowPopover;
    }

    public void clickOnTheActivePicture() {
        pictureWindowPopover.getActivePicture().should(Condition.visible).click();
    }

    public boolean isZoomIn() {
        return pictureWindowPopover.getZoomPicture().isDisplayed();
    }
}