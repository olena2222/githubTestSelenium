
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPaige {
    @FindBy(css = ".h0-mktg")
    private WebElement letsBuildFromHereHeader;
    @FindBy(css = ".HeaderMenu-link--sign-up")
    private WebElement signUpButton;
    @FindBy(css = ".HeaderMenu-link--sign-in")
    private WebElement signInButton;

    public MainPaige(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public MainPaige verifyMainPaigeIsDisplayed() {
        letsBuildFromHereHeader.isDisplayed();
        return this;
    }

    public MainPaige clickSignUp() {
        signUpButton.isEnabled();
        signUpButton.click();
        return this;
    }

    public MainPaige clickSignIn() {
        signInButton.isEnabled();
        signInButton.click();
        return this;
    }


}