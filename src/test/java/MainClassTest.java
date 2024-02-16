import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class MainClassTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://github.com/");
    }

    @Test
    public void testGitHub() {

        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignUp();

        new SignUpPage(driver)
                .verifyIfSignUpPageIsDisplayed()
                .typeEmailField("olena.bosa1@gmail.com")
                .clickContinueToPassword()
                .typePasswordField("passwordTest87$5vg")
                .clickContinueToUsername()
                .typeUsernameField("olegrgrgna")
                .clickContinueToEmailPreferences();

        new LoginPage(driver)
                .verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("password")
                .clickSignIn()
                .forgotPassword();




    }
    @AfterEach
    public void tearDown() {
        driver.close();

    }

}