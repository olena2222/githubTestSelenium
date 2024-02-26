package githubpages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ForgotPasswordPage {
    @FindBy(css = ".auth-form-header")
    private WebElement forgotPasswordHeader;
    public ForgotPasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public boolean atPage() {
        return forgotPasswordHeader.getText().equals("Reset your password");
    }
}