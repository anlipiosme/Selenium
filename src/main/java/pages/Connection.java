package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Connection extends BasePage{
    public Connection (WebDriver driver){
        super(driver);
    }

    static By connectionPhone = By.id ("connection-phone");
    static By connectionSum = By.id ("connection-sum");
    static By connectionEmail = By.id ("connection-email");

    public static  String checkConnectionPhoneBox() {
        return driver.findElement(connectionPhone).getText();
    }

    public static String checkConnectionSumBox() {
        return driver.findElement(connectionSum).getText();
    }

    public static  String checkConnectionEmailBox() {
        return driver.findElement(connectionEmail).getText();
    }
}
