package githubpages;

import org.openqa.selenium.By;

public class ForgotPasswordPage extends BaseComponent {
    By forgotPasswordHeader=By.cssSelector(".auth-form-header");
    public boolean atPage() {
        return equalText(forgotPasswordHeader, "Reset your password");
    }

}