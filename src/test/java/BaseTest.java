
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTest {
    protected WebDriver driver = new ChromeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MtsPage mtsPage = new MtsPage(driver);
    protected ConnectionService connectionService = new ConnectionService(driver);
    protected NetService netService = new NetService(driver);
    protected Debt debt = new Debt(driver);
    protected Installment installment = new Installment(driver);
    protected Connection connection = new Connection(driver);
    protected FramePayment framePayment = new FramePayment(driver);

    @BeforeTest
    public void pageSetup() {
        driver.manage().window().maximize();
    }
    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
