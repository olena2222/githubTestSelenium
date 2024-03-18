package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultPage extends BasePage {
    @FindBy(css = ".cgQapc")
    private WebElement numberOfResults;

    public SearchResultPage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
        webActions = new WebActions(wait);
    }

    public SearchResultPage verifyNumberOfResultsIsDisplayed() {
        webActions.isVisible(numberOfResults);
        return this;
    }
}