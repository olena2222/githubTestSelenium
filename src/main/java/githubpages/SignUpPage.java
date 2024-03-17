package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class SignUpPage extends BasePage {
    @FindBy(css = ".js-signup-typed-welcome")
    private WebElement welcomeToGitHubHeader;
    @FindBy(css = "a[href*=\"/login?return_to=\"].color-fg-on-emphasis")
    private WebElement signInButton;
    @FindBy(css = "#email")
    private WebElement enterEmailField;
    @FindBy(css = "[data-continue-to='password-container']")
    private WebElement continueToPasswordButton;
    @FindBy(css = "#password")
    private WebElement createPasswordField;
    @FindBy(css = "[data-continue-to='username-container']")
    private WebElement continueToUsernameButton;
    @FindBy(css = "#login")
    private WebElement typeUsernameField;
    @FindBy(css = "[data-continue-to='opt-in-container']")
    private WebElement continueToEmailPreferencesButton;
    @FindBy(css = "#opt-in-container")
    private WebElement emailPreferencesContainer;
    @FindBy(css = "#opt_in")
    private WebElement emailPreferencesCheckbox;
    @FindBy(css = "button.js-continue-button.signup-continue-button.form-control.px-3.width-full.width-sm-auto.mt-4.mt-sm-0[data-continue-to=\"captcha-and-submit-container\"]")
    private WebElement continueToVerifyAccountButton;
    public SignUpPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        actionsHelper=new WebActions(wait);
    }
    public SignUpPage verifyIfSignUpPageIsDisplayed() {
        actionsHelper.isVisible(welcomeToGitHubHeader);
        return this;
    }
    public SignUpPage clickSignInButton() {
        actionsHelper.click(signInButton);
        return this;
    }
    public SignUpPage typeEmailField(String email) {
        actionsHelper.sendKeys(enterEmailField,email);
       // wait.until(ExpectedConditions.visibilityOf(emailContainer));
       // enterEmailField.sendKeys(email);
        return this;
    }
    public SignUpPage clickContinueToPassword() {
        actionsHelper.click(continueToPasswordButton);
        return this;
    }
    public SignUpPage typePasswordField(String password) {
        actionsHelper.sendKeys(createPasswordField,password);

        return this;
    }
    public SignUpPage clickContinueToUsername() {
        actionsHelper.click(continueToUsernameButton);
        return this;
    }
    public SignUpPage typeUsernameField(String username) {
        actionsHelper.sendKeys(typeUsernameField, username);

        return this;
    }
    public SignUpPage clickContinueToEmailPreferences() {
        actionsHelper.click(continueToEmailPreferencesButton);
        return this;
    }
    public SignUpPage clickEmailPreferences() {
        emailPreferencesContainer.isDisplayed();
        if (!emailPreferencesCheckbox.isSelected()) {
            emailPreferencesCheckbox.click();
        }
        return this;
    }

    public SignUpPage clickContinueToVerifyAccount() {
        continueToVerifyAccountButton.isEnabled();
        continueToVerifyAccountButton.click();
        return this;
    }
}