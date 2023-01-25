package app;

import app.pages.LoginPage;
import app.pages.ProfilePage;
import com.codeborne.selenide.ElementsCollection;

public class App {

    public LoginPage loginPage;
    public ProfilePage profilePage;

    public ElementsCollection locator;
    public NameInProfile nameInProfile;


    public App() {
        loginPage = PageBuilder.buildLoginPage();
        profilePage = PageBuilder.buildProfilePage();
        nameInProfile = PageBuilder.buildNameInProfile();
    }
}