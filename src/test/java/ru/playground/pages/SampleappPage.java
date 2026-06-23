package ru.playground.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.playground.Links;

import static com.codeborne.selenide.Selenide.*;

public class SampleappPage {

    public void openPage() {
        open(Links.SAMPLE);
    }

    public void registration() {
        SelenideElement formLogin = $x("//input[@class='form-control'][@type='text']");
        SelenideElement formPassword = $x("//input[@class='form-control'][@type='password']");
        SelenideElement submitButton = $x("//button[@class='btn btn-primary']");
        formLogin.setValue("user");
        formPassword.setValue("pwd");

        submitButton.click();

        $x("//label[@id='loginstatus']")
                .shouldHave(Condition.text("Welcome, user!"))
                .shouldHave(Condition.cssValue("color", "rgba(40, 167, 69, 1)"));

    }
}
