import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPaige {
    private WebDriver driver;

    public MainPaige(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".h0-mktg")
    private WebElement letsBuildFromHereHeader;
    @FindBy(css = ".HeaderMenu-link--sign-up")
    private WebElement signUpButton;


    public MainPaige verifyMainHeaderIsDisplayed() {
        letsBuildFromHereHeader.isDisplayed();
        return this;
    }

    public MainPaige verifySignUpIsEnable() {
        signUpButton.isEnabled();
        return this;
    }

    public SignUpPage clickSignUp() {
        signUpButton.click();
        return new SignUpPage(driver);
    }


}
