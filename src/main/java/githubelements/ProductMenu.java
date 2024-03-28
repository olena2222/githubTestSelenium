package githubelements;

import actions.WebActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductMenu extends WebActions {
    By productButton= By.cssSelector("li.HeaderMenu-item:nth-child(1) > button.HeaderMenu-link");
    By actionsButton=By.cssSelector("a[data-analytics-event*='\"action\":\"click to go to Actions\"']");

    public ProductMenu clickActions() {
        actions.moveToElement((WebElement) productButton).click((WebElement) actionsButton).build().perform();
        return this;
    }
}
