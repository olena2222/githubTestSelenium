import org.junit.jupiter.api.Test;
public class MainPageTest extends BaseClass {
    @Test
    public void testMainPage() {
        new MainPaige(driver)
                .verifyMainPaigeIsDisplayed();
    }
}

