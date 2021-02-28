package services.elementsServices.popoverServices;

import org.openqa.selenium.JavascriptExecutor;
import pages.elements.popovers.VideoWindowPopover;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VideoWindowPopoverService {
    private final VideoWindowPopover videoWindowPopover;
    private JavascriptExecutor jsExecutor = (JavascriptExecutor) getWebDriver();

    public VideoWindowPopoverService(VideoWindowPopover videoWindowPopover) {
        this.videoWindowPopover = videoWindowPopover;
    }

    public void playVideo() {
        jsExecutor.executeScript("arguments[0].play(5)", videoWindowPopover.getVideoPlayer());
    }

    public void pauseVideo() {
        jsExecutor.executeScript("arguments[0].pause()", videoWindowPopover.getVideoPlayer());
    }

    public long getDurationOfTheVideo() {
        return (Long) jsExecutor.executeScript("return arguments[0].duration", videoWindowPopover.getVideoPlayer());
    }

    public boolean isPlayIconDisplayed() {
        return videoWindowPopover.getPlayIcon().isDisplayed();
    }
}