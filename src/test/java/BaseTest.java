import githubpages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    @BeforeMethod
    public void setUp() {
        driver.set(new FirefoxDriver());
        // getDriver().manage().window().maximize();
        getDriver().get("https://github.com/");
    }

    public WebDriver getDriver() {
        return driver.get();
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
    @AfterMethod
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }
}