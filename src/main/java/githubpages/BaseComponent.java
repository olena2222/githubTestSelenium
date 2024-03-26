package githubpages;

import actions.WebActions;
import lombok.experimental.Delegate;

public class BaseComponent {
    @Delegate
    private final WebActions webActions = new WebActions();

   /* public void click(WebElement element) {
        webActions.click(element); }

    public void sendKeys(WebElement element, String text) {
        webActions.sendKeys(element, text);
    }

    public void isVisible(WebElement element) {
        webActions.isVisible(element);
    }

    public void isEnabled(WebElement element) {
        webActions.isEnabled(element);
    }*/
}
