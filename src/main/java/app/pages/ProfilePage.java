package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage extends BasePage {

    public SelenideElement headerLocator = $x("//h1");

    public ProfilePage(String pageUrl) {
        super(pageUrl);
    }
}