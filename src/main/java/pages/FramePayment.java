package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePayment extends BasePage{
    public FramePayment(WebDriver driver) {
        super(driver);
    }
    static By frameDescription = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]");
    static By frameButtomDescription = By.xpath("//div[@class='pay-description__text']");

    public static  String checkFrameDescription() {
        return driver.findElement(frameDescription).getText();
    }

    public static  String checkButtomSum() {
        return driver.findElement(frameButtomDescription).getText();
    }

}
