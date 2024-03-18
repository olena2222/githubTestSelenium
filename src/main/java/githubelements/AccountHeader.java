package githubelements;

import githubpages.BasePage;
import githubpages.WebActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHeader extends BasePage {
    @FindBy(css = "span.Button-label > img.avatar.circle")
    private WebElement avatarLabel;

    public AccountHeader(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webActions = new WebActions(wait);
    }

    public AccountHeader verifyAvatarIsDisplayed() {
        webActions.isVisible(avatarLabel);
        return this;
    }
}
