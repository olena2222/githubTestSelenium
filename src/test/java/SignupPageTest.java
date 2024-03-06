import githubelements.AccountHeader;
import githubpages.LoginPage;
import githubpages.SignUpPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
@Execution(ExecutionMode.CONCURRENT)
public class SignupPageTest extends BaseTest {
    @Test
    public void testSignUp() {
        navigateToSignUp();
        new SignUpPage(getDriver())
                .verifyIfSignUpPageIsDisplayed()
                .typeEmailField("olena.bosa2@gmail.com")
                .clickContinueToPassword()
                .typePasswordField("passwordTest87$5vg")
                .clickContinueToUsername()
                .typeUsernameField("olegrgrgna")
                .clickContinueToEmailPreferences()
                .clickEmailPreferences()
                .clickContinueToVerifyAccount();
        new AccountHeader(getDriver())
                .verifyAvatarIsDisplayed();
    }
    @Test
    public void testSignInButton() {
        navigateToSignUp();
        new SignUpPage(getDriver())
                .clickSignInButton();
        new LoginPage(getDriver())
                .verifyLogInPageIsDisplayed();
    }
}
