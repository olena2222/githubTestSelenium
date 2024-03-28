import githubelements.AccountHeader;
import githubpages.LoginPage;
import githubpages.SignUpPage;
import org.junit.jupiter.api.Test;
public class SignupPageTest extends BaseTest {
    @Test
    public void testSignUp() {
        navigateToSignUp();
        new SignUpPage()
                .verifyIfSignUpPageIsDisplayed()
                .typeEmailField("olena.bosa2@gmail.com")
                .clickContinueToPassword()
                .typePasswordField("passwordTest87$5vg")
                .clickContinueToUsername()
                .typeUsernameField("olegrgrgna")
                .clickContinueToEmailPreferences()
                .clickEmailPreferences()
                .clickContinueToVerifyAccount();
        new AccountHeader()
                .verifyAvatarIsDisplayed();
    }
    @Test
    public void testSignInButton() {
        navigateToSignUp();
        new SignUpPage()
                .clickSignInButton();
        new LoginPage()
                .verifyLogInPageIsDisplayed();
    }
}
