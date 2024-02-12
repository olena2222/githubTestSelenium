import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPaige {
    private WebDriver driver;

    public MainPaige(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = ".h0-mktg")
    private WebElement LetsBuildFromHereHeader;
    @FindBy(css = ".HeaderMenu-link--sign-in")
    private WebElement signInButton;
    @FindBy(css = ".HeaderMenu-link--sign-up")
    private WebElement signUpButton;
    @FindBy(css = ".home-campaign-hero form #user_email")
    private WebElement emailFieldTop;
    @FindBy(css = ".home-campaign-hero form [type='submit']")
    private WebElement signUpForGitHubButtonTop;

    public LoginPage clickSignIn() {
        signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUp() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage signUpForGithubButton() {
        signUpForGitHubButtonTop.click();
        return new SignUpPage(driver);
    }

    public MainPaige typeEmail(String email) {
        emailFieldTop.sendKeys(email);
        return this;
    }

    public SignUpPage registerForGithub(String email) {
        this.typeEmail(email);
        this.signUpForGithubButton();
        return new SignUpPage(driver);
    }

}
