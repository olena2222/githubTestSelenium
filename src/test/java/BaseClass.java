import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public abstract class BaseClass {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
