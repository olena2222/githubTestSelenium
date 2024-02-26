import githubpages.MainPage;
import githubpages.SearchResultPage;
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
    public void gitHubIconIsDisplayed() {
        new MainPage(driver)
                .verifyGithubIconIsDisplayed();
    }
}
