import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends BaseClass {
    @Test
    public void testMainPage() {
       new MainPage(driver)
               .verifyMainPageIsDisplayed();

    }
}
