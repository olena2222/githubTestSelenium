package githubpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    @FindBy(css = ".d-flex.pt-sm-9 input#user_email")
    private WebElement emailAddress;
    @FindBy(css = ".d-flex.pt-sm-9 button.btn-mktg")
    private WebElement signUpForGitHubButton;
    @FindBy(css = ".d-flex.pt-sm-9 a.home-campaign-enterprise")
    private WebElement startFreeEnterpriseTrial;
    public MainPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        actionsHelper=new WebActions( wait);
    }
    public MainPage verifyMainPageIsDisplayed() {
        actionsHelper.isVisible(letsBuildFromHereHeader);
        return this;
    }
    public MainPage verifyGithubIcon() {
        actionsHelper.click(githubIcon);
        return this;
    }
    public MainPage verifySearchField(String search) {
        actionsHelper.click(searchButton);
        searchButton.sendKeys(search);
        searchButton.sendKeys(Keys.ENTER);
        return this;
    }
    public MainPage clickSignUp() {
        actionsHelper.click(signUpButton);
        return this;
    }
    public MainPage clickSignIn() {
        actionsHelper.click(signInButton);
        return this;
    }
    public MainPage clickSignUpForGitHub(String email) {
        actionsHelper.sendKeys(emailAddress,email);
        actionsHelper.click(signUpForGitHubButton);
        return this;
    }
    public MainPage clickStartFreeEnterpriseTrial() {
        actionsHelper.click(startFreeEnterpriseTrial);
        return this;
    }

}