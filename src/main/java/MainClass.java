import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Olena\\test1\\drivers\\geckodriver.exe");
     driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        Duration duration=Duration.ofSeconds(10);
        WebDriverWait wait=new WebDriverWait(driver,duration);

       // MainPaige mainPaige=new MainPaige(driver);
MainPaige mainPaige= PageFactory.initElements(driver,MainPaige.class);
SignUpPage signUpPage=PageFactory.initElements(driver,SignUpPage.class);

mainPaige.clickSignUp();
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='mb-1']/child::label[@class='text-mono signup-text-prompt']"))));
signUpPage.register("olena.bosa1@gmail.com","Qwertyasd432", "njnj");


    }
}
