package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetService extends BasePage{
    public NetService(WebDriver driver){
        super(driver);
    }

    By netChoose = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
    By net = By.xpath ("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p");
    static By netPhone = By.id ("internet-phone");
    static By netSum = By.id ("internet-sum");
    static By netEmail = By.id ("internet-email");

    public NetService checkNet() {
        driver.findElement(netChoose).click();
        driver.findElement(net).click();
        return this;
    }

    public static  String checkNetPhoneBox() {
        return driver.findElement(netPhone).getText();
    }

    public static String checkNetSumBox() {
        return driver.findElement(netSum).getText();
    }

    public static  String checkNetEmailBox() {
        return driver.findElement(netEmail).getText();
    }

}
