package githubpages;

import org.openqa.selenium.By;

public class FeaturesActionsPage extends BaseComponent {
    By actionsIcon = By.cssSelector(".d-inline-block.mr-3");

    public FeaturesActionsPage verifyActionsPageIsDisplayed() {
        isVisible(actionsIcon);
        return this;
    }
}
