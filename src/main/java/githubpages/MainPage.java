package githubpages;

import org.openqa.selenium.By;

public class MainPage extends BaseComponent {
    By githubIcon= By.cssSelector(".octicon.octicon-mark-github");
    By searchButton= By.cssSelector(".header-search-button");
    By searchField= By.cssSelector("#query-builder-test");
    By letsBuildFromHereHeader= By.cssSelector(".h0-mktg");
    By signUpButton= By.cssSelector(".HeaderMenu-link--sign-up");
    By signInButton= By.cssSelector(".HeaderMenu-link--sign-in");
    By emailAddress= By.cssSelector(".d-flex.pt-sm-9 input#user_email");
    By signUpForGitHubButton= By.cssSelector(".d-flex.pt-sm-9 button.btn-mktg");
    By startFreeEnterpriseTrial= By.cssSelector(".d-flex.pt-sm-9 a.home-campaign-enterprise");


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
        sendKeys(searchField,search);
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