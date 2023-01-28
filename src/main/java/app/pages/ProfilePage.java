package app.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage extends BasePage {

    public SelenideElement headerLocator = $x("//h1");

    public SelenideElement locatorLogout = $x("//a[@href='/logout/']");

    public SelenideElement createAccount = $x("//a[@href ='/register/']");




    public SelenideElement nameInProfile = $x("//*[contains(text(),'admin1')]");

    public SelenideElement name2 = $x("//div[@class = 'caption']/child::h4");

    public ProfilePage(String pageUrl) {
        super(pageUrl);
    }
}