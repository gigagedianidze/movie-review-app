import Steps.KvebaSteps;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class KvebaTests extends Config {
    KvebaSteps kvebaSteps = new KvebaSteps();

    @BeforeMethod
    public void open(String url) throws InterruptedException {
        open("https://www.swoop.ge/");
    }

    @Test(description = "Gayidulia or Not")
    @Description("click on checkbox and validate value of message text")
    @Feature("value validation")
    @Story("correct text")
    @Severity(SeverityLevel.NORMAL)
    public void KvebaTesting() {
        kvebaSteps.clickKvebaButton()
                .clickSushiButton()
                .clickFirstOption()
                .compareValues();
    }
    @AfterMethod
    public void closeTab() {
        closeWebDriver();
    }

}
