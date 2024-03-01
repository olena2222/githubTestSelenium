import githubpages.EnterprisePlansPage;
import githubpages.MainPage;
import githubpages.SearchResultPage;
import githubpages.SignUpPage;
import org.testng.annotations.Test;
public class MainPageTest extends BaseTest {
    @Test
    public void testMainPageIsOpened() {
        new MainPage(getDriver())
                .verifyMainPageIsDisplayed();
    }
    @Test
    public void testSearchField() {
        new MainPage(getDriver())
                .verifySearchField("Security");
        new SearchResultPage(getDriver())
                .verifyNumberOfResultsIsDisplayed();
    }
    @Test
    public void testGitHubIcon() {
        new MainPage(getDriver())
                .verifyGithubIcon();
        new MainPage(getDriver())
                .verifyMainPageIsDisplayed();
    }
    @Test
    public void testSignUpForGitHub() {
        new MainPage(getDriver())
                .clickSignUpForGitHub("test123@mail.com");
        new SignUpPage(getDriver())
                .verifyIfSignUpPageIsDisplayed();
    }
    @Test
    public void testFreeEnterpriseTrial() {
        new MainPage(getDriver())
                .clickStartFreeEnterpriseTrial();
        new EnterprisePlansPage(getDriver())
                .verifyEnterprisePlansPageIsDisplayed();
    }
}
