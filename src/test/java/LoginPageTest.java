import githubelements.AccountHeader;
import githubpages.ForgotPasswordPage;
import githubpages.LoginPage;
import githubpages.MainPage;
import githubpages.SignUpPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class LoginPageTest extends BaseTest {
    @Test
    public void testForgotPassword() {
        navigateToSignIn();
        new LoginPage()
                .forgotPassword();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        assertTrue(forgotPasswordPage.atPage());
    }
    @Test
    public void createAnAccount() {
        navigateToSignIn();
        new LoginPage()
                .createAccount();
        new SignUpPage()
                .verifyIfSignUpPageIsDisplayed();
    }
    @Test
    public void testLogin() {
        navigateToSignIn();
        LoginPage loginPage = new LoginPage();
        loginPage.verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
        new AccountHeader()
                .verifyAvatarIsDisplayed();
    }
    @Test
    public void testGithubIcon() {
        navigateToSignIn();
        new LoginPage()
                .verifyGitHubIcon();
        new MainPage()
                .verifyMainPageIsDisplayed();
    }
}
