package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.BasePage.driver;

public class Debt extends BasePage {
    public Debt(WebDriver driver) {
        super(driver);
    }

    By debtChoose = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
    By debt = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p");
    static By debtPhone = By.id("score-arrears");
    static By debtSum = By.id("arrears-sum");
    static By debtEmail = By.id("arrears-email");

    public Debt checkDebt() {
        driver.findElement(debtChoose).click();
        driver.findElement(debt).click();
        return this;
    }

    public static  String checkDebtPhoneBox() {
        return driver.findElement(debtPhone).getText();
    }

    public static String checkDebtSumBox() {
        return driver.findElement(debtSum).getText();
    }

    public static  String checkDebtEmailBox() {
        return driver.findElement(debtEmail).getText();
    }
}
