package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage extends BasePage {

    public SelenideElement headerLocator = $x("//h1");

    public SelenideElement locatorLogout = $x("//a[@href='/logout/']");

    public SelenideElement createAccount = $x("//a[@href ='/register/']");
    public SelenideElement tabReddit = $x("//a[@href='#reddit']");

    public SelenideElement checkRedditAccounts = $x("//a[@href='/profile/add/reddit']");




    public ProfilePage(String pageUrl) {
        super(pageUrl);
    }
}