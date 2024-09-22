import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MyTest {
    private WebDriver driver;
    private final static String site = "https://www.mts.by/";
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(site);
    }

    @Test
    public void titleTest() {
        WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение')]"));
            if (title.isDisplayed()) {
                System.out.println("Название блока совпадает");
            } else {
                System.out.println("Название блока провалено");
            }
    }
    @Test
    public void paymentTest() {
        WebElement tradeMark = driver.findElement(By.xpath("//div[@class='pay__partners']"));
        if (tradeMark.isDisplayed()) {
            System.out.println("Логотипы есть");
        } else {
            System.out.println("Логитипы провалились");
        }
    }
    @Test
    public void service (){
         WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
         link.click();
         System.out.println("Ссылка 'Подробнее о сервисе' работает");
        }
    @Test
    public void serviceConnection(){
        WebElement connection = driver.findElement(By.xpath("//*[contains(text(), 'Услуги связи')]"));
        connection.click();
        WebElement phoneInput = driver.findElement(By.id("connection-phone"));
        phoneInput.sendKeys("297777777");
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        continueButton.click();
        System.out.println("Кнопка 'Продолжить' работает корректно");
   //     driver.quit();
    }
    @AfterTest
    public void closing() {
        driver.quit();
    }
}

