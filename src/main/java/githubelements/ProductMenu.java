package githubelements;

import actions.WebActions;
import org.openqa.selenium.By;

public class ProductMenu extends WebActions {
    By productButton = By.cssSelector("li.HeaderMenu-item:nth-child(1) > button.HeaderMenu-link");
    By actionsButton = By.cssSelector("a[data-analytics-event*='\"action\":\"click to go to Actions\"']");

    public ProductMenu clickActions() {
        actions.moveToElement(findElement(productButton)).click(findElement(actionsButton)).build().perform();
        return this;
    }
}
