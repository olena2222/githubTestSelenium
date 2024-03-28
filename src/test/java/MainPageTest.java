import githubpages.EnterprisePlansPage;
import githubpages.MainPage;
import githubpages.SearchResultPage;
import githubpages.SignUpPage;
import org.junit.jupiter.api.Test;
public class MainPageTest extends BaseTest {
    @Test
    public void testMainPageIsOpened() {
        new MainPage()
                .verifyMainPageIsDisplayed();
    }
    @Test
    public void testSearchField() {
        new MainPage()
                .verifySearchField("Security");
        new SearchResultPage()
                .verifyNumberOfResultsIsDisplayed();
    }
    @Test
    public void testGitHubIcon() {
        new MainPage()
                .verifyGithubIcon();
        new MainPage()
                .verifyMainPageIsDisplayed();
    }
    @Test
    public void testSignUpForGitHub() {
        new MainPage()
                .clickSignUpForGitHub("test123@mail.com");
        new SignUpPage()
                .verifyIfSignUpPageIsDisplayed();
    }
    @Test
    public void testFreeEnterpriseTrial() {
        new MainPage()
                .clickStartFreeEnterpriseTrial();
        new EnterprisePlansPage()
                .verifyEnterprisePlansPageIsDisplayed();
    }

}
