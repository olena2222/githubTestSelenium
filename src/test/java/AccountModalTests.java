import githubelements.AccountModal;
import githubpages.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
@Execution(ExecutionMode.CONCURRENT)

public class AccountModalTests extends BaseTest {
    @Test
    public void userNavigationModalTest() {
        navigateToSignIn();
        new LoginPage(getDriver())
                .verifyLogInPageIsDisplayed()
                .typeEmail("olena.bosa@gmail.com")
                .typePassword("Qa138468")
                .clickSignIn();
        new AccountModal(getDriver())
                .clickAvatar()
                .verifyUserNavigationIsDispalyed();
    }
}
