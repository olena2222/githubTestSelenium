package githubelements;

import githubpages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductMenu extends BasePage {
    @FindBy(css = "li.HeaderMenu-item:nth-child(1) > button.HeaderMenu-link")
    private WebElement productButton;
    @FindBy(css = "a[data-analytics-event*='\"action\":\"click to go to Actions\"']")
    private WebElement actionsButton;
    public ProductMenu(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public ProductMenu clickActions(){
      actions.moveToElement(productButton).click(actionsButton).build().perform();
return this;
    }
}
