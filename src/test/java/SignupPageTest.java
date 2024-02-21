import org.junit.jupiter.api.Test;
public class SignupPageTest extends BaseClass {
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
    }
}
