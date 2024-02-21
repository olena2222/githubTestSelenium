import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends BaseClass {
    @Test
    public void testForgotPassword() {
        navigateToSignIn();
        new LoginPage(driver)
                .forgotPassword();
    }
    @Test
    public void signInWithPasskey() {
        navigateToSignIn();
        new LoginPage(driver)
                .signInWithPasskey();
    }
    @Test
    public void createAnAccount() {
       navigateToSignIn();
        new LoginPage(driver)
                .createAccount()
                .isUserRedirectedToSignUp();

    }
    @Test
    public void testLogin() {
        navigateToSignIn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
        assertTrue(loginPage.isUserLoggedInSuccessfully());
    }

}
