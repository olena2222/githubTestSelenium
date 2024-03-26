package githubpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseComponent {
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
        PageFactory.initElements(driver, this);
    }

    public MainPage verifyMainPageIsDisplayed() {
        isVisible(letsBuildFromHereHeader);
        return this;
    }

    public MainPage verifyGithubIcon() {
        click(githubIcon);
        return this;
    }

    public MainPage verifySearchField(String search) {
        click(searchButton);
        searchButton.sendKeys(search);
        searchButton.sendKeys(Keys.ENTER);
        return this;
    }

    public MainPage clickSignUp() {
        click(signUpButton);
        return this;
    }

    public MainPage clickSignIn() {
        click(signInButton);
        return this;
    }

    public MainPage clickSignUpForGitHub(String email) {
        sendKeys(emailAddress, email);
        click(signUpForGitHubButton);
        return this;
    }

    public MainPage clickStartFreeEnterpriseTrial() {
        click(startFreeEnterpriseTrial);
        return this;
    }

}