package githubpages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class MainPage extends BasePage {
    @FindBy(css = ".octicon.octicon-mark-github")
    private WebElement githubIcon;
    @FindBy(css = ".header-search-button")
    private WebElement searchButton;
    @FindBy(css = ".h0-mktg")
    private WebElement letsBuildFromHereHeader;
    @FindBy(css = ".HeaderMenu-link--sign-up")
    private WebElement signUpButton;
    @FindBy(css = ".HeaderMenu-link--sign-in")
    private WebElement signInButton;
    public MainPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public MainPage verifyMainPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(letsBuildFromHereHeader)).isDisplayed();
        return this;
    }
    public MainPage verifyGithubIconIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(githubIcon)).isDisplayed();
        return this;
    }
    public MainPage verifySearchField(String search) {
        wait.until(ExpectedConditions.visibilityOf(searchButton)).click();
        searchButton.sendKeys(search);
        searchButton.sendKeys(Keys.ENTER);
        return this;
    }
    public MainPage clickSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
        return this;
    }
    public MainPage clickSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
        return this;
    }
}