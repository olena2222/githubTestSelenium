package githubelements;

import githubpages.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AccountModal extends BaseComponent {
    @FindBy(css = "span.Button-label > img.avatar.circle")
    private WebElement avatarLabel;
    @FindBy(css = "nav[aria-label='User navigation']")
    private WebElement userNavigation;

    public AccountModal(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public AccountModal clickAvatar() {
        click(avatarLabel);
        return this;
    }
    public AccountModal verifyUserNavigationIsDispalyed() {
        isVisible(userNavigation);
        return this;
    }
}
