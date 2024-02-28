import Steps.EstetikaSteps;
import Steps.KvebaSteps;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class EstetikaTests extends Config {
    EstetikaSteps estetikaSteps = new EstetikaSteps();

    @BeforeMethod
    public void open(String url) throws InterruptedException {
        open("https://www.swoop.ge/");
    }

    @Test(description = "Compare Prices")
    @Description("click on checkbox and validate value of message text")
    @Feature("value validation")
    @Story("correct text")
    @Severity(SeverityLevel.NORMAL)
    public void EstetikaTesting() {
        estetikaSteps.clickEstetikaButton()
                .selectPasitKlebadiDropDown()
                .getFirstValue()
                .getSecondValue();

    }
    @AfterMethod
    public void closeTab() {
        closeWebDriver();
    }

}
