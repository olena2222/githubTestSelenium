package actions;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    public void sendKeys(By element, String text) { wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element))).sendKeys(text); }
    public void isVisible(By element) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element))).isDisplayed();
    }
    public void isEnabled(By element) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element))).isEnabled();
    }
        public boolean isSelected(By element) {
          return wait.until(ExpectedConditions.visibilityOf(driver.findElement(element))).isSelected();
        }
    public boolean equalText(By element, String text) {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));
    }
        }

