import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseClass {
    @Test
    public void testForgotPassword() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();
        new LoginPage(driver)
                .forgotPassword();
    }
    @Test
    public void signInWithPasskey() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();
        new LoginPage(driver)
                .signInWithPasskey();
    }
    @Test
    public void createAnAccount() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();
        new LoginPage(driver)
                .createAccount();
    }
    @Test
    public void testLogin() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed()
                .clickSignIn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
        Assertions.assertTrue(loginPage.isUserLoggedInSuccessfully(), "User should be logged in successfully");
    }

}
