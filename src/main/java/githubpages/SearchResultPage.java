package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseComponent {
    @FindBy(css = ".cgQapc")
    private WebElement numberOfResults;

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public SearchResultPage verifyNumberOfResultsIsDisplayed() {
        isVisible(numberOfResults);
        return this;
    }
}