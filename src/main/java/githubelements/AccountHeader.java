package githubelements;

import githubpages.BaseComponent;
import org.openqa.selenium.By;

public class AccountHeader extends BaseComponent {
    By avatarLabel=By.cssSelector("span.Button-label > img.avatar.circle");

    public AccountHeader verifyAvatarIsDisplayed() {
        isVisible(avatarLabel);
        return this;
    }
}
