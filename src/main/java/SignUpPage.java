import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(css = "#email")
    private WebElement typeEmailField;
    @FindBy(css = "[data-continue-to='password-container']")
    private WebElement continueButtonAfterEmail;

    @FindBy(css = "#password")
    private WebElement createPasswordField;
    @FindBy(css = "[data-continue-to='username-container']")
    private WebElement continueButtonAfterPassword;
    @FindBy(css = "#login")
    private WebElement typeUsernameField;
    @FindBy(css = "[data-continue-to='opt-in-container']")
    private WebElement continueButtonAfterUsername;


    public SignUpPage typeEmailField(String email) {
        typeEmailField.sendKeys(email);
        return this;
    }

    public SignUpPage clickContinueEmail() {
        continueButtonAfterEmail.click();
        return this;
    }


    public SignUpPage typePasswordField(String password) {
        createPasswordField.sendKeys(password);
        return this;
    }

    public SignUpPage clickContinuePassword() {
        continueButtonAfterPassword.click();
        return this;
    }

    public SignUpPage typeUsernameField(String username) {
        typeUsernameField.sendKeys(username);
        return this;
    }

    public SignUpPage clickContinueUsername() {
        continueButtonAfterUsername.click();
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
