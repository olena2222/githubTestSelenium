import githubelements.AccountHeader;
import githubpages.ForgotPasswordPage;
import githubpages.LoginPage;
import githubpages.MainPage;
import githubpages.SignUpPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPageTest extends BaseTest {
    @Test
    public void testForgotPassword() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        navigateToSignIn();
        new LoginPage(getDriver())
                .forgotPassword();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        assertTrue(forgotPasswordPage.atPage());
    }

    @Test
    public void createAnAccount() {
        navigateToSignIn();
        new LoginPage(getDriver())
                .createAccount();
        new SignUpPage(getDriver())
                .verifyIfSignUpPageIsDisplayed();
    }

    @Test
    public void testLogin() {
        navigateToSignIn();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
        new AccountHeader(getDriver())
                .verifyAvatarIsDisplayed();
    }

    @Test
    public void testGithubIcon() {
        navigateToSignIn();
        new LoginPage(getDriver())
                .verifyGitHubIcon();
        new MainPage(getDriver())
                .verifyMainPageIsDisplayed();
    }
}
