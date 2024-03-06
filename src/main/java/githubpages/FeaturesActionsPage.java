package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FeaturesActionsPage extends BasePage{
    @FindBy(css = ".d-inline-block.mr-3")
    private WebElement actionsIcon;
    public FeaturesActionsPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public FeaturesActionsPage verifyActionsPageIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(actionsIcon)).isDisplayed();
        return this;
    }
}
