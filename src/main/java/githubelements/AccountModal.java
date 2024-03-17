package githubelements;

import githubpages.WebActions;
import githubpages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class AccountModal extends BasePage {
    @FindBy(css = "span.Button-label > img.avatar.circle")
    private WebElement avatarLabel;
    @FindBy(css = "nav[aria-label='User navigation']")
    private WebElement userNavigation;
    public AccountModal(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
        actionsHelper=new WebActions(wait);
    }
    public AccountModal clickAvatar() {
        actionsHelper.click(avatarLabel);
        return this;
    }
    public AccountModal verifyUserNavigationIsDispalyed() {
        actionsHelper.isVisible(userNavigation);
        return this;
    }
}
