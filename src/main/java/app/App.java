package app;

import app.pages.LoginPage;
import app.pages.ProfilePage;

public class App {
    public LoginPage loginPage;
    public ProfilePage profilePage;

    public App() {
        loginPage = PageBuilder.buildLoginPage();
        profilePage = PageBuilder.buildProfilePage();
    }
}