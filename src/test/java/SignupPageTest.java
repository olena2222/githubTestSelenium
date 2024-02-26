import githubelements.AccountHeader;
import githubpages.LoginPage;
import githubpages.MainPage;
import githubpages.SignUpPage;
import org.junit.jupiter.api.Test;
public class SignupPageTest extends BaseTest {
    @Test
    public void testSignUp() {
        navigateToSignUp();
        new SignUpPage(driver)
                .verifyIfSignUpPageIsDisplayed()
                .typeEmailField("olena.bosa2@gmail.com")
                .clickContinueToPassword()
                .typePasswordField("passwordTest87$5vg")
                .clickContinueToUsername()
                .typeUsernameField("olegrgrgna")
                .clickContinueToEmailPreferences()
                .clickEmailPreferences()
                .clickContinueToVerifyAccount();
        new AccountHeader(driver)
                .verifyAvatarIsDisplayed();
    }
    @Test
    public void testSignInButton() {
        navigateToSignUp();
        new SignUpPage(driver)
                .clickSignInButton();
        new LoginPage(driver)
                .verifyLogInPageIsDisplayed();
    }
}
