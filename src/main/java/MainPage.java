import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MainPage {
    @FindBy(css = ".h0-mktg")
    private WebElement letsBuildFromHereHeader;
    @FindBy(css = ".HeaderMenu-link--sign-up")
    private WebElement signUpButton;
    @FindBy(css = ".HeaderMenu-link--sign-in")
    private WebElement signInButton;
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public MainPage verifyMainPageIsDisplayed() {
        letsBuildFromHereHeader.isDisplayed();
        return this;
    }
    public MainPage clickSignUp() {
        signUpButton.isDisplayed();
        signUpButton.click();
        return this;
    }
    public MainPage clickSignIn() {
        signInButton.isDisplayed();
        signInButton.click();
        return this;
    }
}