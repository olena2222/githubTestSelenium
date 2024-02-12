import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(css = "#email")
    private WebElement enterEmailField;
    @FindBy(css = "[data-continue-to='password-container']")
    private WebElement continueButtonEmail;

    @FindBy(css = "#password")
    private WebElement createPasswordField;
    @FindBy(css = "[data-continue-to='username-container']")
    private WebElement continueButtonPassword;
    @FindBy(css = "#login")
    private WebElement typeUsernameField;
    @FindBy(css = "[data-continue-to='opt-in-container']")
    private WebElement continueButtonUsername;


    public SignUpPage typeEmailField(String email) {
        enterEmailField.sendKeys(email);
        return this;
    }

    public SignUpPage clickContinueEmail() {
        continueButtonEmail.click();
        return this;
    }


    public SignUpPage typePasswordField(String password) {
        createPasswordField.sendKeys(password);
        return this;
    }

    public SignUpPage clickContinuePassword() {
        continueButtonPassword.click();
        return this;
    }

    public SignUpPage typeUsernameField(String username) {
        typeUsernameField.sendKeys(username);
        return this;
    }

    public SignUpPage clickContinueUsername() {
        continueButtonUsername.click();
        return this;
    }

    public SignUpPage register(String email, String password, String username) {

        typeEmailField(email);
        clickContinueEmail();

        typePasswordField(password);
        clickContinuePassword();

        typeUsernameField(username);
        clickContinueUsername();
        return this;
    }

}
