package ru.playground.pages;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PlaygroundPage {

    public PlaygroundPage openPage() {
        open("/");
        return this;
    }

    public AjaxPage goToAjaxPage() {
        $x("//a[@href='/ajax']").click();
        return new AjaxPage();
    }
}
