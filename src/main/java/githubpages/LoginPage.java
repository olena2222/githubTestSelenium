package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseComponent {
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
        PageFactory.initElements(driver, this);
    }

    public LoginPage verifyLogInPageIsDisplayed() {
        isVisible(headerSignIn);
        return this;
    }

    public LoginPage verifyGitHubIcon() {
        click(githubIconOnSignIn);
        return this;
    }

    public LoginPage typeEmail(String email) {
        sendKeys(emailField, email);
        return this;
    }

    public LoginPage typePassword(String password) {
        sendKeys(passwordField, password);
        return this;
    }

    public LoginPage clickSignIn() {
        click(signInButton);
        return this;
    }

    public LoginPage forgotPassword() {
        click(forgotPasswordLink);
        return this;
    }

    public LoginPage createAccount() {
        click(createAccount);
        return this;
    }
}
