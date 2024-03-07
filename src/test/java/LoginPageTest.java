import githubelements.AccountHeader;
import githubpages.ForgotPasswordPage;
import githubpages.LoginPage;
import githubpages.MainPage;
import githubpages.SignUpPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import static org.junit.jupiter.api.Assertions.assertTrue;
@Execution(ExecutionMode.CONCURRENT)
//@ExtendWith(CustomStrategy.class)
public class LoginPageTest extends BaseTest {
    @Test
    public void testForgotPassword() {
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
