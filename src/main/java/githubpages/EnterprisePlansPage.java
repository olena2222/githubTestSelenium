package githubpages;

import org.openqa.selenium.By;

public class EnterprisePlansPage extends BaseComponent {
    By pickTrialPlanHeader = By.cssSelector(".d-md-block");

    public EnterprisePlansPage verifyEnterprisePlansPageIsDisplayed() {
        isVisible(pickTrialPlanHeader);
        return this;
    }
}