package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EnterprisePlansPage extends BasePage {
    @FindBy(css = ".d-md-block")
    private WebElement pickTrialPlanHeader;

    public EnterprisePlansPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        webActions = new WebActions(wait);
    }

    public EnterprisePlansPage verifyEnterprisePlansPageIsDisplayed() {
        webActions.isVisible(pickTrialPlanHeader);
        return this;
    }
}