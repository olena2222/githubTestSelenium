
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPaige {
    WebDriver driver;
    @FindBy(css = ".h0-mktg")
    private WebElement letsBuildFromHereHeader;
    @FindBy(css = ".HeaderMenu-link--sign-up")
    private WebElement signUpButton;
    @FindBy(css = ".HeaderMenu-link--sign-in")
    private WebElement signInButton;
    public MainPaige(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public MainPaige verifyMainPaigeIsDisplayed() {
        letsBuildFromHereHeader.isDisplayed();
        return this;
    }

    public SignUpPage clickSignUp() {
        signUpButton.isEnabled();
        signUpButton.click();
        return new SignUpPage(driver);
    }
    public LoginPage clickSignIn(){
signInButton.isDisplayed();
signInButton.click();
        return new LoginPage(driver);
    }


}