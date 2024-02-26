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
        new LoginPage(driver)
                .forgotPassword();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        assertTrue(forgotPasswordPage.atPage());
    }
    @Test
    public void createAnAccount() {
        navigateToSignIn();
        new LoginPage(driver)
                .createAccount();
        new SignUpPage(driver)
                .verifyIfSignUpPageIsDisplayed();
    }
    @Test
    public void testLogin() {
        navigateToSignIn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
        new AccountHeader(driver)
                .verifyAvatarIsDisplayed();
    }
    @Test
    public void testGithubIcon() {
        navigateToSignIn();
        new LoginPage(driver)
                .verifyGitHubIcon();
        new MainPage(driver)
                .verifyMainPageIsDisplayed();
    }
}
