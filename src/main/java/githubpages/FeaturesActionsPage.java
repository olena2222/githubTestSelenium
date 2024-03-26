package githubpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturesActionsPage extends BaseComponent {
    @FindBy(css = ".d-inline-block.mr-3")
    private WebElement actionsIcon;

    public FeaturesActionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public FeaturesActionsPage verifyActionsPageIsDisplayed() {
        isVisible(actionsIcon);
        return this;
    }
}
