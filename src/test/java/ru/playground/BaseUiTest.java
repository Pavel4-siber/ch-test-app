package ru.playground;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseUiTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = Links.URL;
        Configuration.browser = "chrome";
        Configuration.timeout = 8000;
        Configuration.headless = true;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));

    }

    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }
}
