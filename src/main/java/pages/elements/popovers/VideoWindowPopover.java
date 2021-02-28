package pages.elements.popovers;

import com.codeborne.selenide.SelenideElement;
import helper.Locators;

import static com.codeborne.selenide.Selenide.$;

public class VideoWindowPopover {
    private SelenideElement videoPlayer = $(Locators.get(this.getClass().getSimpleName() + ".videoPlayer"));
    private SelenideElement playIcon = $(Locators.get(this.getClass().getSimpleName() + ".playIcon"));

    public SelenideElement getVideoPlayer() {
        return videoPlayer;
    }

    public SelenideElement getPlayIcon() {
        return playIcon;
    }
}