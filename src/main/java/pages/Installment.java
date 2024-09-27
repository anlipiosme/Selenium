package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Installment extends BasePage{
    public Installment (WebDriver driver) {
        super(driver);
    }

    By installmentChoose = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
    By installment = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p");
    static By installmentChoosePhone = By.id("score-instalment");
    static By installmentChooseSum = By.id("instalment-sum");
    static By installmentChooseEmail = By.id("instalment-email");

    public Installment checkInstallment() {
        driver.findElement(installmentChoose).click();
        driver.findElement(installment).click();
        return this;
    }

    public static  String checkInstallmentPhoneBox() {
        return driver.findElement(installmentChoosePhone).getText();
    }

    public static String checkInstallmentSumBox() {
        return driver.findElement(installmentChooseSum).getText();
    }

    public static  String checkInstallmentEmailBox() {
        return driver.findElement(installmentChooseEmail).getText();
    }
}
