
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    WebDriverWait wait;
WebDriver driver;
    @FindBy(css = ".js-signup-typed-welcome")
    private WebElement welcomeToGitHubHeader;
    @FindBy(css = "#email-container")
    private WebElement emailContainer;
    @FindBy(css = "#email")
    private WebElement enterEmailField;
    @FindBy(css = "[data-continue-to='password-container']")
    private WebElement continueToPasswordButton;
    @FindBy(css = "#password-container")
    private WebElement passwordContainer;
    @FindBy(css = "#password")
    private WebElement createPasswordField;
    @FindBy(css = "[data-continue-to='username-container']")
    private WebElement continueToUsernameButton;
    @FindBy(css = "#username-container")
    private WebElement usernameContainer;
    @FindBy(css = "#login")
    private WebElement typeUsernameField;
    @FindBy(css = "[data-continue-to='opt-in-container']")
    private WebElement continueToEmailPreferencesButton;
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SignUpPage verifyIfSignUpPageIsDisplayed() {
        welcomeToGitHubHeader.isDisplayed();
        return this;
    }

    public SignUpPage typeEmailField(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(emailContainer));
        enterEmailField.sendKeys(email);
        return this;
    }

    public SignUpPage clickContinueToPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continueToPasswordButton));
        continueToPasswordButton.click();
        return this;
    }

    public SignUpPage typePasswordField(String password) {
        passwordContainer.isDisplayed();
        createPasswordField.sendKeys(password);
        return this;
    }

    public SignUpPage clickContinueToUsername() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continueToUsernameButton));
        continueToUsernameButton.click();
        return this;
    }

    public SignUpPage typeUsernameField(String username) {
        usernameContainer.isDisplayed();
        typeUsernameField.sendKeys(username);
        return this;
    }

    public SignUpPage clickContinueToEmailPreferences() {
        continueToEmailPreferencesButton.isEnabled();
        continueToEmailPreferencesButton.click();
        return this;
    }

}