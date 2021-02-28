package stepdefinitions.popoverStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.elementsServices.popoverServices.PictureWindowPopoverService;

import static org.junit.Assert.assertTrue;

public class PictureWindowStepDefinitions {
    private final PictureWindowPopoverService pictureWindowPopoverService;

    public PictureWindowStepDefinitions(PictureWindowPopoverService pictureWindowPopoverService) {
        this.pictureWindowPopoverService = pictureWindowPopoverService;
    }

    @And("click on the active image on the picture window")
    public void clickOnTheActiveImageOnThePictureWindow() {
        pictureWindowPopoverService.clickOnTheActivePicture();
    }

    @Then("the zoom brings the image closer on the picture window")
    public void theZoomBringsTheImageCloserOnThePictureWindow() {
        assertTrue(pictureWindowPopoverService.isZoomIn());
    }
}