import githubelements.ProductMenu;
import githubpages.FeaturesActionsPage;
import org.junit.jupiter.api.Test;

public class ProductMenuTest extends BaseTest {
    @Test
    public void clickActions () {
        new ProductMenu()
                .clickActions();
        new FeaturesActionsPage()
                .verifyActionsPageIsDisplayed();
    }
}
