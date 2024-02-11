import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPaige {
    private WebDriver driver;
    public MainPaige(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(css = ".h0-mktg")
    private WebElement LetsBuildFromHereHeader;

    @FindBy(xpath = "//a[@class='HeaderMenu-link HeaderMenu-link--sign-in flex-shrink-0 no-underline d-block d-lg-inline-block border border-lg-0 rounded rounded-lg-0 p-2 p-lg-0']")
    private WebElement signInButton;
    @FindBy(css = ".HeaderMenu-link--sign-up")
    private WebElement signUpButton;
    @FindBy(xpath = "//input[@id='user_email']" )
    private WebElement emailField;
    @FindBy(xpath = "//button[text()='Sign up for GitHub']" )
    private WebElement signUpForGitHubButton;
    public LoginPage clickSignIn(){
        signInButton.click();
        return new LoginPage(driver);
    }
    public SignUpPage clickSignUp(){
       signUpButton.click();
        return new SignUpPage(driver);
    }
    public SignUpPage signUpForButton(){
        signUpForGitHubButton.click();
        return new SignUpPage(driver);
    }
    public MainPaige typeEmail(String email){
        emailField.sendKeys(email);
        return this;
    }
    public SignUpPage registerForGithub(String email){
        this.typeEmail(email);
        this.signUpForButton();
        return new SignUpPage(driver);
    }

}
