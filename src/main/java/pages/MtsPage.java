package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MtsPage extends BasePage {
    public MtsPage(WebDriver driver) {
        super(driver);
    }

    static By headerTitle = By.xpath("//h2[contains(text(),'Онлайн пополнение')]");
    By tradeMark = By.xpath ("//div[@class='pay__partners']");
    By moreAboutService = By.linkText("Подробнее о сервисе");

    public static String checkTitle(){
        String actualRersult= driver.findElement(headerTitle).getText();
        return actualRersult;
    }

    public MtsPage checkTradeMarks(){
        driver.findElement(tradeMark).isDisplayed();
        return this;
    }

    public MtsPage checkServise(){
        driver.findElement(moreAboutService).click();
        return this;
    }

}