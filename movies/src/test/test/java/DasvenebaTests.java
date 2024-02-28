import Steps.DasvenebaSteps;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@Epic("Dasveneba Tests")
@Listeners(Config.class)
public class DasvenebaTests extends Config {
    DasvenebaSteps dasvenebaSteps = new DasvenebaSteps();

    @BeforeMethod
    public void open(String url) throws InterruptedException {
        open("https://www.swoop.ge/");
    }

    @Test(description = "Authorisation")
    @Description("click on checkbox and validate value of message text")
    @Feature("value validation")
    @Story("correct text")
    @Severity(SeverityLevel.NORMAL)
    public void DasvenebaTesting() {
            dasvenebaSteps.clickDasveneba()
                    .checkSastumroCheckbox()
                    .clickFirstOption()
                    .clickDateInput()
                    .authorizationButtonIsVisible()
                    .authorizationButtonIsNotClickable();
    }
    @AfterMethod
    public void closeTab() {
        closeWebDriver();
        }

}
