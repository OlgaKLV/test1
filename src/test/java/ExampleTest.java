import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class ExampleTest extends A_BaseTest
{

    @Test
    public void loginTestAuth() {
        app.loginPage.open();
        app.loginPage.login("admin1", "admin1");
        app.profilePage.headerLocator.shouldBe(visible, ofSeconds(10));
    }

    @Test
    public void matchingTestName() {
        app.loginPage.open();
        app.loginPage.login("admin1", "admin1");
        app.profilePage.nameInProfile.shouldBe(visible);
        app.profilePage.name2.shouldHave(text("admin1 "));
        
    }
}


