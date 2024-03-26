package actions;

import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class WebActions {
    private final WebDriver driver = DriverManager.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    protected final Actions actions = new Actions(driver);

    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendKeys(WebElement element, String text) { wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text); }
    public void isVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
    public void isEnabled(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
    }
}
