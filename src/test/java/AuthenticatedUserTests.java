import org.junit.jupiter.api.Test;
public class AuthenticatedUserTests extends BaseClass {
    @Test
    public void testEditAccount() {
        navigateToSignIn();
        new LoginPage(driver)
                .verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn()
                .clickAvatar()
                .clickYourProfile();
    }
}
