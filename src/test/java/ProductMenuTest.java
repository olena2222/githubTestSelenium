import githubelements.ProductMenu;
import githubpages.FeaturesActionsPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ProductMenuTest extends BaseTest {
    @Test
    public void clickActions () {
        new ProductMenu(getDriver())
                .clickActions();
        new FeaturesActionsPage(getDriver())
                .verifyActionsPageIsDisplayed();
    }
}
