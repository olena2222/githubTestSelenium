package githubpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions extends BasePage {
    public WebActions(WebDriverWait wait) {
        this.wait = wait;
    }

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void sendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }

    public void isVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

    public void isEnabled(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
    }
}
