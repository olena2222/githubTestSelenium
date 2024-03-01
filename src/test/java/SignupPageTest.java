import githubelements.AccountHeader;
import githubpages.LoginPage;
import githubpages.SignUpPage;
import org.testng.annotations.Test;

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
