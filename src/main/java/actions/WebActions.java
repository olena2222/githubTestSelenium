package actions;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    public void click(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendKeys(By element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element))).sendKeys(text + Keys.ENTER);
    }
    public boolean isVisible(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isDisplayed();
    }
    public boolean isEnabled(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isEnabled();
    }
    public boolean isSelected(By element) {
        return driver.findElement(element).isSelected();
    }
    public boolean equalText(By element, String text) {
        return wait.until(ExpectedConditions.textToBe(element, text));
    }
    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
}

