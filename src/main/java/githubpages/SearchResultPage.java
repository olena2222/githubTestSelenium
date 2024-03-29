package githubpages;

import org.openqa.selenium.By;

public class SearchResultPage extends BaseComponent {
    By numberOfResults = By.cssSelector(".cgQapc");

    public SearchResultPage verifyNumberOfResultsIsDisplayed() {
        isVisible(numberOfResults);
        return this;
    }
}