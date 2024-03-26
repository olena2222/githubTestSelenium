package githubelements;

import githubpages.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHeader extends BaseComponent {
    @FindBy(css = "span.Button-label > img.avatar.circle")
    private WebElement avatarLabel;

    public AccountHeader(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public AccountHeader verifyAvatarIsDisplayed() {
        isVisible(avatarLabel);
        return this;
    }
}
