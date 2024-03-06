import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static void setUpDriver(){
        if (driver.get()==null){
            driver.set(new FirefoxDriver());
        }
    }
    public static WebDriver getDriver() {
        return driver.get();
    }

    public  static void quitDriver() {

        if (driver != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
