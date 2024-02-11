import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainClassTest {
    WebDriver driver;

    @BeforeAll
    public void beforeClassMethod() {
       /* driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
*/
    }

    @BeforeEach
    public void setUp() {
        // driver.get("https://github.com/");
    }

    @Test
    public void testGitHub() {
        System.setProperty("webdriver.gecko.driver", "D:\\Olena\\test1\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://github.com/");

        driver.findElement(By.cssSelector(".h0-mktg"));
        driver.findElement(By.cssSelector(".HeaderMenu-link--sign-up"));
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

    @Test
    public void method2() {
    }

    @Test
    public void method3() {
    }

    @AfterEach
    public void tearDown() {
        driver.close();

    }

    @AfterAll
    @Disabled
    public void afterClassMethod() {
    }
}
