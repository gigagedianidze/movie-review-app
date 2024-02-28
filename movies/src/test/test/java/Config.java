import com.codeborne.selenide.Configuration;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Config implements ITestListener {
    @BeforeClass
    public void configs() {
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot(getWebDriver());
    }
    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}