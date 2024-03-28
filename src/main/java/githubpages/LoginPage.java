package githubpages;

import org.openqa.selenium.By;

public class LoginPage extends BaseComponent {
    By headerSignIn = By.cssSelector(".auth-form-header");
    By githubIconOnSignIn = By.cssSelector(".octicon.octicon-mark-github");
    By emailField = By.cssSelector("#login_field");
    By passwordField = By.cssSelector("#password");
    By signInButton = By.cssSelector(".btn-primary");
    By forgotPasswordLink = By.cssSelector("#forgot-password");
    By createAccount = By.cssSelector(".mt-1 a");

    public LoginPage verifyLogInPageIsDisplayed() {
        isVisible(headerSignIn);
        return this;
    }

    public LoginPage verifyGitHubIcon() {
        click(githubIconOnSignIn);
        return this;
    }

    public LoginPage typeEmail(String email) {
        sendKeys(emailField, email);
        return this;
    }

    public LoginPage typePassword(String password) {
        sendKeys(passwordField, password);
        return this;
    }

    public LoginPage clickSignIn() {
        click(signInButton);
        return this;
    }

    public LoginPage forgotPassword() {
        click(forgotPasswordLink);
        return this;
    }

    public LoginPage createAccount() {
        click(createAccount);
        return this;
    }
}
