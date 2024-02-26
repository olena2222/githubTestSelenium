import githubelements.AccountModal;
import githubpages.LoginPage;
import org.junit.jupiter.api.Test;
public class AccountModalTests extends BaseTest {
    @Test
    public void userNavigationModalTest() {
        navigateToSignIn();
        new LoginPage(driver)
                .verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
        new AccountModal(driver)
                .clickAvatar()
                .verifyUserNavigationIsDispalyed();
    }
}
