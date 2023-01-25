package app.pages;

import com.codeborne.selenide.SelenideElement;
import helpers.Driver;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage {

    public SelenideElement loginField = $x("//input[@name='username']");
    public SelenideElement passwordField = $x("//input[@name='password']");
    public SelenideElement signInButton = $x("//input[@type='submit']");

    public SelenideElement nameInProfile = $x("//*[contains(text(),'admin1')]");

    public LoginPage(String pageUrl) {
        super(pageUrl);
    }

    public void login(String userName, String password) {
        loginField.setValue(userName);
        passwordField.setValue(password);
        signInButton.click();
        Driver.waitForUrlContains("profile");
    }
}