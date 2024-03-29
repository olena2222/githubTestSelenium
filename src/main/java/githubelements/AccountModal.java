package githubelements;

import githubpages.BaseComponent;
import org.openqa.selenium.By;

public class AccountModal extends BaseComponent {
    By avatarLabel = By.cssSelector("span.Button-label > img.avatar.circle");
    By userNavigation = By.cssSelector("nav[aria-label='User navigation']");

    public AccountModal clickAvatar() {
        click(avatarLabel);
        return this;
    }

    public AccountModal verifyUserNavigationIsDispalyed() {
        isVisible(userNavigation);
        return this;
    }
}
