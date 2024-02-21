import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriverWait wait;
    @FindBy(css = ".js-signup-typed-welcome")
    private WebElement welcomeToGitHubHeader;
    @FindBy(css = ".auth-form-header")
    private WebElement headerSignIn;
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
    @FindBy(css = "p.mb-0.mt-0.js-webauthn-subtle-emu-control")
    private WebElement signInWithPasskey;
    @FindBy(css = "span.Button-label > img.avatar.circle")
    private WebElement avatarLabel;
    @FindBy(css = "#item-bca448a0-1360-46d5-b07c-f1fe5cbc8672")
    private WebElement yourProfile;


    public LoginPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public LoginPage verifyLogInPageIsDisplayed() {
        headerSignIn.isDisplayed();
        return this;
    }

    public LoginPage typeEmail(String email) {
        emailField.isDisplayed();
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage typePassword(String password) {
        passwordField.isDisplayed();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickSignIn() {
        signInButton.isEnabled();
        signInButton.click();
        return this;
    }
    public boolean isUserLoggedInSuccessfully() {
        return avatarLabel.isDisplayed();
    }

    public LoginPage forgotPassword() {
        forgotPasswordLink.isEnabled();
        forgotPasswordLink.click();
        return this;
    }


    public LoginPage signInWithPasskey() {
        wait.until(ExpectedConditions.visibilityOf(signInWithPasskey));
        signInWithPasskey.click();
        return this;
    }


    public LoginPage createAccount() {
        createAccount.isEnabled();
        createAccount.click();
        return this;
    }
    public boolean isUserRedirectedToSignUp() {
       return welcomeToGitHubHeader.isDisplayed();
    }


    public LoginPage clickAvatar() {
        avatarLabel.isDisplayed();
        avatarLabel.click();
        return this;
    }

    public LoginPage clickYourProfile() {
        wait.until(ExpectedConditions.visibilityOf(yourProfile)).click();
        return this;
    }




}
