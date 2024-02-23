import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AccountHeader {
    @FindBy(css = "#dialog-show-dialog-4e008272-39e2-45f5-81bb-9aada0dbdbc7")
    private WebElement accountMenu;
    @FindBy(css = "svg.octicon-mark-github[height='32']")
    private WebElement githubLogo;
    @FindBy(css = "a.AppHeader-context-item")
    private WebElement dashboardHeader;
    @FindBy(css = ".AppHeader-search-control")
    private WebElement searchContainer;
    @FindBy(css = "#global-create-menu-button")
    private WebElement createMenuButton;
    @FindBy(css = "#icon-button-c6edf76a-420d-4545-8c37-b194d2e3a911")
    private WebElement issuesButton;
    @FindBy(css = "#icon-button-6f4adde2-70d4-48b0-8e6e-1b94a2a59e72")
    private WebElement pullRequestsButton;
    @FindBy(css = "#AppHeader-notifications-button")
    private WebElement notificationButton;
    @FindBy(css = "span.Button-label > img.avatar.circle")
    private WebElement avatarLabel;
    public AccountHeader(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public AccountHeader verifyAvatarIsDisplayed() {
        avatarLabel.isDisplayed();
        return this;
    }
}
