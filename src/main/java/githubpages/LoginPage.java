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
        actionsHelper=new WebActions(wait);
    }
    public LoginPage verifyLogInPageIsDisplayed() {
       actionsHelper.isVisible(headerSignIn);
        return this;
    }
    public LoginPage verifyGitHubIcon() {
        actionsHelper.click(githubIconOnSignIn);
        return this;
    }
    public LoginPage typeEmail(String email) {
        actionsHelper.sendKeys(emailField, email);
        return this;
    }
    public LoginPage typePassword(String password) {
        actionsHelper.sendKeys(passwordField, password);
        return this;
    }
    public LoginPage clickSignIn() {
        actionsHelper.click(signInButton);
        return this;
    }
    public LoginPage forgotPassword() {
        actionsHelper.click(forgotPasswordLink);
        return this;
    }
    public LoginPage createAccount() {
        actionsHelper.click(createAccount);
        return this;
    }
}
