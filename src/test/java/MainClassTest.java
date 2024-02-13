import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class MainClassTest {
    WebDriver driver;

    @BeforeAll
    public void beforeClassMethod() {

    }

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
        .verifyMainHeaderIsDisplayed()
                .verifySignUpIsEnable()
                        .clickSignUp();

        new SignUpPage(driver)
                .verifyIfHeaderIsDisplayed()
                .typeEmailField("emailTest")
                                .clickContinueToPassword()
                                        .typePasswordField("passwordTest")
                                                .clickContinueToUsername()
                                                        .typeUsernameField("olena")
                                                                .clickContinueToEmailPreferences()
                                                                        .register();









        driver.findElement(By.cssSelector("#email-container")).isDisplayed();
        driver.findElement(By.cssSelector("#email")).sendKeys("test");
        driver.findElement(By.cssSelector("[data-continue-to='password-container']")).isEnabled();
        driver.findElement(By.cssSelector("[data-continue-to='password-container']")).click();
        driver.findElement(By.cssSelector("#password-container")).isDisplayed();
        driver.findElement(By.cssSelector("#password")).sendKeys("testpassword");
        driver.findElement(By.cssSelector("[data-continue-to='username-container']")).isEnabled();
        driver.findElement(By.cssSelector("[data-continue-to='username-container']")).click();
        driver.findElement(By.cssSelector("#username-container")).isDisplayed();
        driver.findElement(By.cssSelector("#login")).sendKeys("name");
        driver.findElement(By.cssSelector("[data-continue-to='opt-in-container']")).isEnabled();
        driver.findElement(By.cssSelector("[data-continue-to='opt-in-container']")).click();

    }



    @AfterEach
    public void tearDown() {
        driver.close();

    }

}
