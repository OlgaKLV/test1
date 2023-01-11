import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class ExampleTest extends A_BaseTest
{
    @Test
    public void loginTestAuth() {
        app.loginPage.open();
        app.loginPage.login("admin1", "admin1");
        app.profilePage.headerLocator.shouldBe(visible, ofSeconds(10));
        app.profilePage.locatorLogout.shouldBe(visible,ofSeconds(10));
        app.profilePage.locatorLogout.click();
        app.profilePage.createAccount.shouldBe(visible,ofSeconds(10));
        app.profilePage.createAccount.click();


    }
}

