import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;


    public SignUpPage (WebDriver driver)
    {
        this.driver=driver;
    }


    @FindBy(xpath="//input[@id='email']")
    private WebElement typeEmail;

    @FindBy(xpath = "//button[@data-optimizely-event='click.signup_continue.email']")
    private WebElement continueEmail;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement createPassword;

    @FindBy(xpath = "//div[@id='password-container']//button[@data-optimizely-event='click.signup_continue.password']" )
    private WebElement continuePassword;

    @FindBy(xpath = "//input[@id='login']" )
    private WebElement typeUserName;
    @FindBy(xpath = "//button[@data-optimizely-event='click.signup_continue.username']")
    private WebElement continueUsername;
    @FindBy(xpath = "//span[text()='Welcome to GitHub!']")
    private WebElement headingSignUp;

    public SignUpPage typeEmailField(String email){
   typeEmail.sendKeys(email);
        return this;
    }
    public SignUpPage clickContinue1(){
        continueEmail.click();
        return this;
    }
    public SignUpPage typePasswordField(String password) {
        createPassword.sendKeys(password);
        return this;

    }
    public SignUpPage clickContinue2(){
        continuePassword.click();
        return this;
    }
    public SignUpPage typeUsernameField(String username) {
        typeUserName.sendKeys(username);
        return this;
    }
    public SignUpPage clickContinue3(){
        continueUsername.click();
        return this;
    }
    public SignUpPage register(String email,String password, String username){

        this.typeEmailField(email);
       this.clickContinue1();

       this.typePasswordField(password);
       this.clickContinue2();
       this.typeUsernameField(username);
       this.clickContinue3();
       return new SignUpPage(driver);
    }

}
