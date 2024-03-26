package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterprisePlansPage extends BaseComponent {
    @FindBy(css = ".d-md-block")
    private WebElement pickTrialPlanHeader;

    public EnterprisePlansPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public EnterprisePlansPage verifyEnterprisePlansPageIsDisplayed() {
        isVisible(pickTrialPlanHeader);
        return this;
    }
}