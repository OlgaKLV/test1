package app;

import app.pages.LoginPage;
import app.pages.ProfilePage;

public class PageBuilder {

        public static LoginPage buildLoginPage() {
        return new LoginPage("/login");
    }

        public static ProfilePage buildProfilePage() {
        return new ProfilePage("/profile");
    }
}