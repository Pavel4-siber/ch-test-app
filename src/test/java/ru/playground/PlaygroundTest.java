package ru.playground;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import ru.playground.pages.PlaygroundPage;
import ru.playground.pages.SampleappPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaygroundTest extends BaseUiTest {

    private final PlaygroundPage playgroundPage = new PlaygroundPage();
    private final SampleappPage sampleappPage = new SampleappPage();

    @Test
    void shouldWaitForAjaxDataAndClick() {
        playgroundPage.openPage().goToAjaxPage().clickButton();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(Links.AJAX, currentUrl);
    }

    @Test
    void shouldSuccessfulSampleappPage() {
        sampleappPage.openPage();
        sampleappPage.registration();
    }
}
