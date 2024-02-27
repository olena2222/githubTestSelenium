import githubpages.EnterprisePlansPage;
import githubpages.MainPage;
import githubpages.SearchResultPage;
import githubpages.SignUpPage;
import org.junit.jupiter.api.Test;
public class MainPageTest extends BaseTest {
    @Test
    public void testMainPageIsOpened() {
        new MainPage(driver)
                .verifyMainPageIsDisplayed();
    }
    @Test
    public void testSearchField() {
        new MainPage(driver)
                .verifySearchField("Security");
        new SearchResultPage(driver)
                .verifyNumberOfResultsIsDisplayed();
    }
    @Test
    public void testGitHubIcon() {
        new MainPage(driver)
                .verifyGithubIcon();
        new MainPage(driver)
                .verifyMainPageIsDisplayed();
    }
    @Test
    public void testSignUpForGitHub() {
        new MainPage(driver)
                .clickSignUpForGitHub("test123@mail.com");
        new SignUpPage(driver)
                .verifyIfSignUpPageIsDisplayed();
    }
    @Test
    public void testFreeEnterpriseTrial() {
        new MainPage(driver)
                .clickStartFreeEnterpriseTrial();
        new EnterprisePlansPage(driver)
                .verifyEnterprisePlansPageIsDisplayed();
    }
}
