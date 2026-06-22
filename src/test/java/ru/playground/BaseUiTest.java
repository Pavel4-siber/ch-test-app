package ru.playground;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseUiTest {

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = Links.URL;
        Configuration.browser = "chrome";
        Configuration.timeout = 8000;
    }

    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }
}
