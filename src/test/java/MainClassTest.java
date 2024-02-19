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
    public void testSignUp() {

        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignUp();

        new SignUpPage(driver)
                .verifyIfSignUpPageIsDisplayed()
                .typeEmailField("olena.bosa2@gmail.com")
                .clickContinueToPassword()
                .typePasswordField("passwordTest87$5vg")
                .clickContinueToUsername()
                .typeUsernameField("olegrgrgna")
                .clickContinueToEmailPreferences()
                .clickEmailPreferences()
                .clickContinueToVerifyAccount();

    }

    @Test
    public void testForgotPassword() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();

        new LoginPage(driver)
                .forgotPassword();
    }

    @Test
    public void signInWithPasskey() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();

        new LoginPage(driver)
                .signInWithPasskey();
    }

    @Test
    public void createAnAccount() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();

        new LoginPage(driver)
                .createAccount();
    }

    @Test
    public void testLogin() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();

        new LoginPage(driver)
                .verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
    }

    @Test
    public void testEditAccount() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();

        new LoginPage(driver)
                .verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn()
                .clickAvatar()
                .clickYourProfile();

    }


    @AfterEach
    public void tearDown() {
        driver.close();

    }

}