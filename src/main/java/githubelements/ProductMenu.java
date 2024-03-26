package githubelements;

import actions.WebActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMenu extends WebActions {
    @FindBy(css = "li.HeaderMenu-item:nth-child(1) > button.HeaderMenu-link")
    private WebElement productButton;
    @FindBy(css = "a[data-analytics-event*='\"action\":\"click to go to Actions\"']")
    private WebElement actionsButton;

    public ProductMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ProductMenu clickActions() {
        actions.moveToElement(productButton).click(actionsButton).build().perform();
        return this;
    }
}
