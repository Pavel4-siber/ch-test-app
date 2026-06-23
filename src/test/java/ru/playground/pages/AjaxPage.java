package ru.playground.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import ru.playground.Links;

import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AjaxPage {

    public void clickButton() {
        $("#ajaxButton").click();

        $(".bg-success")
                .shouldBe(Condition.visible, ofSeconds(17))
                .shouldHave(Condition.text("Data loaded with AJAX get request."))
                .shouldHave(Condition.cssValue("background-color", "rgba(40, 167, 69, 1)"));
    }

    public void checkUrl() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(Links.AJAX, currentUrl);
    }

}
