import githubpages.MainPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public abstract class BaseTest {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
    }
    protected void navigateToSignUp() {
        new MainPage(driver)
                .verifyMainPageIsDisplayed()
                .clickSignUp();
    }
    protected void navigateToSignIn() {
        new MainPage(driver)
                .verifyMainPageIsDisplayed()
                .clickSignIn();
    }
    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
