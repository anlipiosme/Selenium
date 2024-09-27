package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static void open(String url){
        driver.get(url);
    }
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(8)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}