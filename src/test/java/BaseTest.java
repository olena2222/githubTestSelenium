import githubpages.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    @BeforeEach
    public void setUp() {
        DriverManager.setUpDriver();
     DriverManager.getDriver().get("https://github.com/");
    }
    protected void navigateToSignUp() {
        new MainPage(getDriver())
                .verifyMainPageIsDisplayed()
                .clickSignUp();
    }
    protected void navigateToSignIn() {
        new MainPage(getDriver())
                .verifyMainPageIsDisplayed()
                .clickSignIn();
    }
    protected WebDriver getDriver() {
        return DriverManager.getDriver();
    }
    @AfterEach
    public void tearDown() {
       DriverManager.quitDriver();
    }
}