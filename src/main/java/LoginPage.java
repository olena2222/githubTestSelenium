import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(css = ".auth-form-header")
    private WebElement headerSignIn;
    @FindBy(css = "#login_field")
    private WebElement emailField;
    @FindBy(css = "#password")
    private WebElement passwordField;
    @FindBy(css = ".btn-primary")
    private WebElement signInButton;
    @FindBy(css = "#forgot-password")
    private WebElement forgotPasswordLink;
    @FindBy(css = ".mt-1 a")
    private WebElement createAccount;
    @FindBy(css = ".mb-0")
    private WebElement signInWithPasskey;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage verifyLogInPageIsDisplayed(){
        headerSignIn.isDisplayed();
        return this;
    }
    public LoginPage typeEmail(String email){
        emailField.sendKeys(email);
        return this;
    }
    public LoginPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
public LoginPage clickSignIn(){
        signInButton.click();
        return this;
}
public LoginPage forgotPassword(){
        forgotPasswordLink.click();
        return this;
}
public LoginPage signInWithPasskey (){
        signInWithPasskey.click();
        return this;
}
public LoginPage createAccount(){
        createAccount.click();
        return this;
}





}
