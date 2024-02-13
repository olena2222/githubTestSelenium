import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#login_field")
    private WebElement emailField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(css = "[type='submit']")
    private WebElement signInButton;
    @FindBy(css = "#forgot-password")
    private WebElement forgotPassword;
    @FindBy(css = "[data-ga-click='Sign in, switch to sign up']")
    private WebElement createAccount;

    public LoginPage typeEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage logInAccount(String email, String password) {
        typeEmail(email);
        typePassword(password);
        signInButton.click();
        return this;
    }

}
