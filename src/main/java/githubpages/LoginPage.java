package githubpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class LoginPage extends BasePage {
    @FindBy(css = ".auth-form-header")
    private WebElement headerSignIn;
    @FindBy(css = ".octicon.octicon-mark-github")
    private WebElement githubIconOnSignIn;
    @FindBy(css = "#login_field")
    private WebElement emailField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(css = ".btn-primary")
    private WebElement signInButton;
    @FindBy(css = "#forgot-password")
    private WebElement forgotPasswordLink;
    @FindBy(css = ".mt-1 a")
    private WebElement createAccount;
    public LoginPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public LoginPage verifyLogInPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(headerSignIn)).isDisplayed();
        return this;
    }
    public LoginPage verifyGitHubIcon() {
        wait.until(ExpectedConditions.visibilityOf(githubIconOnSignIn)).click();
        return this;
    }
    public LoginPage typeEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField)).sendKeys(email);
        return this;
    }
    public LoginPage typePassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys(password);
        return this;
    }
    public LoginPage clickSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
        return this;
    }
    public LoginPage forgotPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(forgotPasswordLink)).click();
        return this;
    }
    public LoginPage createAccount() {
        wait.until(ExpectedConditions.visibilityOf(createAccount)).click();
        return this;
    }
}
