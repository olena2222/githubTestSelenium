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
        webActions =new WebActions(wait);
    }
    public AccountModal clickAvatar() {
        webActions.click(avatarLabel);
        return this;
    }
    public AccountModal verifyUserNavigationIsDispalyed() {
        webActions.isVisible(userNavigation);
        return this;
    }
}
