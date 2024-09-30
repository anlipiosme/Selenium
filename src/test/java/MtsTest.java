
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;


import static helper.Urls.MTS_PAGE;

public class MtsTest extends BaseTest{

    @Test
    @Description ("Проверка заголовка")
    public void checkTitle(){
        basePage.open(MTS_PAGE);
        SoftAssert softAssert = new SoftAssert();
        String expectedTitle="Онлайн пополнение";
        softAssert.assertEquals(MtsPage.checkTitle(), expectedTitle,"Заголовок не совпал");
    }

    @Test
    @Description ("Проверка логотипов")
    public void checkTradeMarks (){
        mtsPage.checkTradeMarks();
    }

    @Test
    @Description ("Проверка ссылки Подробнее о сервисе")
    public void checkService(){
        mtsPage.checkServise();
    }

    @Test
    @Description ("Проверка оплаты")
    public FramePayment checkConnections (){
        basePage.open(MTS_PAGE);

        connectionService.checkConnection();
        return new FramePayment(driver);


    }
    @Test
    @Description ("Проверка фрейма")
    public void checkFrame(){
        SoftAssert softAssert = new SoftAssert();
        String expectedSum = "11.00 BYN";
        String expectedSumButton = "Оплатить  11.00 BYN ";

        softAssert.assertEquals(FramePayment.checkFrameDescription(),expectedSum, "Ошибка");
        softAssert.assertEquals(FramePayment.checkButtomSum(),expectedSumButton, "Ошибка");
    }

    @Test
    @Description ("Проверка меню Интернет")
    public void CheckNetService(){
        basePage.open(MTS_PAGE);
        netService.checkNet();
        SoftAssert softAssert = new SoftAssert();
        String expectedPhoneNet ="Номер телефона";
        String expectedSumNet = "Сумма";
        String expectedEmailNet = "E-mail для отправки чека";

        softAssert.assertEquals(NetService.checkNetPhoneBox(), expectedPhoneNet, "Ошибка" );
        softAssert.assertEquals(NetService.checkNetSumBox(), expectedSumNet, "Ошибка" );
        softAssert.assertEquals(NetService.checkNetEmailBox(), expectedEmailNet, "Ошибка" );
    }

    @Test
    @Description("Проверка меню Задолженность")
    public void CheckDebtService(){
        basePage.open(MTS_PAGE);
        debt.checkDebt();
        SoftAssert softAssert = new SoftAssert();
        String expectedPhoneDebt ="Номер счета на 2073";
        String expectedSumDebt = "Сумма";
        String expectedEmailDebt = "E-mail для отправки чека";

        softAssert.assertEquals(Debt.checkDebtPhoneBox(), expectedPhoneDebt, "Ошибка" );
        softAssert.assertEquals(Debt.checkDebtSumBox(), expectedSumDebt, "Ошибка" );
        softAssert.assertEquals(Debt.checkDebtEmailBox(), expectedEmailDebt, "Ошибка" );
    }

    @Test
    @Description("Проверка меню Рассрочка")
    public void CheckInstallmentService(){
        basePage.open(MTS_PAGE);
        installment.checkInstallment();
        SoftAssert softAssert = new SoftAssert();
        String expectedPhoneInstallment ="Номер счета на 44";
        String expectedSumInstallment = "Сумма";
        String expectedEmailInstallment = "E-mail для отправки чека";

        softAssert.assertEquals(Installment.checkInstallmentPhoneBox(), expectedPhoneInstallment, "Ошибка" );
        softAssert.assertEquals(Installment.checkInstallmentSumBox(), expectedSumInstallment, "Ошибка" );
        softAssert.assertEquals(Installment.checkInstallmentEmailBox(), expectedEmailInstallment, "Ошибка" );
    }

    @Test
    @Description("Проверка меню Связь")
    public void CheckConnectionService(){
        basePage.open(MTS_PAGE);
        SoftAssert softAssert = new SoftAssert();
        String expectedPhoneConnection ="Номер телефона";
        String expectedSumConnection = "Сумма";
        String expectedEmailConnection = "E-mail для отправки чека";

        softAssert.assertEquals(Connection.checkConnectionPhoneBox(), expectedPhoneConnection, "Ошибка" );
        softAssert.assertEquals(Connection.checkConnectionSumBox(), expectedSumConnection, "Ошибка" );
        softAssert.assertEquals(Connection.checkConnectionEmailBox(), expectedEmailConnection, "Ошибка" );
    }
}