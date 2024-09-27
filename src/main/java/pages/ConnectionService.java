package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConnectionService extends BasePage{
    public ConnectionService(WebDriver driver) {
        super(driver);
    }

    By phoneInput = By.id ("connection-phone");
    By sum = By.id ("connection-sum");
    By continueButton = By.xpath ("//button[contains(text(),'Продолжить')]");
    By frameFind = By.xpath("/html/body/div[8]/div/iframe");

    public void checkConnection(){
        driver.findElement(phoneInput).sendKeys("297777777");
        driver.findElement(sum).sendKeys("11");
        driver.findElement(continueButton).click();
        driver.switchTo().frame((WebElement) frameFind);
    }
}
