package githubpages;

import org.openqa.selenium.By;

public class SignUpPage extends BaseComponent {
    By welcomeToGitHubHeader=By.cssSelector(".js-signup-typed-welcome");
    By signInButton=By.cssSelector("a[href*=\"/login?return_to=\"].color-fg-on-emphasis");
    By enterEmailField=By.cssSelector("#email");
    By continueToPasswordButton=By.cssSelector("[data-continue-to='password-container']");
    By createPasswordField=By.cssSelector("#password");
    By continueToUsernameButton=By.cssSelector("[data-continue-to='username-container']");
    By typeUsernameField=By.cssSelector("#login");
    By continueToEmailPreferencesButton=By.cssSelector("[data-continue-to='opt-in-container']");
    By emailPreferencesContainer=By.cssSelector("#opt-in-container");
    By emailPreferencesCheckbox=By.cssSelector("#opt_in");

    By continueToVerifyAccountButton=By.cssSelector("button.js-continue-button.signup-continue-button.form-control.px-3.width-full.width-sm-auto.mt-4.mt-sm-0[data-continue-to=\"captcha-and-submit-container\"]");

    public SignUpPage verifyIfSignUpPageIsDisplayed() {
        isVisible(welcomeToGitHubHeader);
        return this;
    }

    public SignUpPage clickSignInButton() {
        click(signInButton);
        return this;
    }

    public SignUpPage typeEmailField(String email) {
        sendKeys(enterEmailField, email);
        return this;
    }

    public SignUpPage clickContinueToPassword() {
        click(continueToPasswordButton);
        return this;
    }

    public SignUpPage typePasswordField(String password) {
        sendKeys(createPasswordField, password);
        return this;
    }

    public SignUpPage clickContinueToUsername() {
        click(continueToUsernameButton);
        return this;
    }

    public SignUpPage typeUsernameField(String username) {
        sendKeys(typeUsernameField, username);
        return this;
    }

    public SignUpPage clickContinueToEmailPreferences() {
        click(continueToEmailPreferencesButton);
        return this;
    }

    public SignUpPage clickEmailPreferences() {
        if (!isSelected(emailPreferencesCheckbox)) {
            click(emailPreferencesContainer);
        }
        return this;
    }


    public SignUpPage clickContinueToVerifyAccount() {
        isEnabled(continueToVerifyAccountButton);
        click(continueToVerifyAccountButton);
        return this;
    }
}