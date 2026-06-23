package ru.playground;

import org.junit.jupiter.api.Test;
import ru.playground.pages.AjaxPage;
import ru.playground.pages.PlaygroundPage;
import ru.playground.pages.SampleappPage;

public class PlaygroundTest extends BaseUiTest {

    private final PlaygroundPage playgroundPage = new PlaygroundPage();
    private final SampleappPage sampleappPage = new SampleappPage();
    private final AjaxPage ajaxPage = new AjaxPage();

    @Test
    void shouldWaitForAjaxDataAndClick() {
        playgroundPage.openPage().goToAjaxPage().clickButton();
        ajaxPage.checkUrl();
    }

    @Test
    void shouldSuccessfulSampleappPage() {
        sampleappPage.openPage();
        sampleappPage.registration();
    }
}
