import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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

    @FindBy(css ="#username-container" )
    private WebElement usernameContainer;
    @FindBy(css = "#login")
    private WebElement typeUsernameField;
    @FindBy(css = "[data-continue-to='opt-in-container']")
    private WebElement continueToEmailPreferencesButton;

    public SignUpPage verifyIfHeaderIsDisplayed() {
        welcomeToGitHubHeader.isDisplayed();
        return this;
    }

    public SignUpPage typeEmailField(String email) {
        emailContainer.isDisplayed();
        enterEmailField.sendKeys(email);
        return this;
    }

    public SignUpPage clickContinueToPassword() {
        continueToPasswordButton.isEnabled();
        continueToPasswordButton.click();
        return this;
    }


    public SignUpPage typePasswordField(String password) {
        passwordContainer.isDisplayed();
        createPasswordField.sendKeys(password);
        return this;
    }

    public SignUpPage clickContinueToUsername() {
        continueToUsernameButton.isEnabled();
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

    public SignUpPage register(String email, String password, String username) {
        typeEmailField(email);
        clickContinueToPassword();
        typePasswordField(password);
        clickContinueToUsername();
        typeUsernameField(username);
        clickContinueToEmailPreferences();
        return this;
    }

}
