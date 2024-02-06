import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(xpath = "//input[@id='login_field']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='password']" )
    private WebElement passwordField;
    @FindBy(xpath = "//input[@value='Sign in']" )
    private WebElement signInButton;
@FindBy(xpath = "//div[@class='auth-form-header p-0']/h1" )
    private WebElement heading;
@FindBy(xpath = "//div[text()='Incorrect username or password.']" )
    private WebElement error;
@FindBy(xpath = "//a[text()='Create an account']" )
    private WebElement createAccount;

public LoginPage typeEmail(String email){
   emailField.sendKeys(email);
    return this;
}
    public LoginPage typePassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }
    public LoginPage loginWithIncorrectCred(String email,String password) {
        this.typeEmail(email);
        this.typeEmail(password);
       signInButton.click();
        return new LoginPage(driver);
    }
    public String getHeadingText(){
    return heading.getText();
    }
    public String getErrorText(){
        return error.getText();
    }
}
