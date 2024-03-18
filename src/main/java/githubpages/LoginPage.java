package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
        webActions = new WebActions(wait);
    }

    public LoginPage verifyLogInPageIsDisplayed() {
        webActions.isVisible(headerSignIn);
        return this;
    }

    public LoginPage verifyGitHubIcon() {
        webActions.click(githubIconOnSignIn);
        return this;
    }

    public LoginPage typeEmail(String email) {
        webActions.sendKeys(emailField, email);
        return this;
    }

    public LoginPage typePassword(String password) {
        webActions.sendKeys(passwordField, password);
        return this;
    }

    public LoginPage clickSignIn() {
        webActions.click(signInButton);
        return this;
    }

    public LoginPage forgotPassword() {
        webActions.click(forgotPasswordLink);
        return this;
    }

    public LoginPage createAccount() {
        webActions.click(createAccount);
        return this;
    }
}
