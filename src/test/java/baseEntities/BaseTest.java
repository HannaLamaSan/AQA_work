package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import steps.*;
import utils.configuration.ReadProperties;
public class BaseTest {

    protected WebDriver driver;
    protected LoginStep loginStep;
    protected AddItemStep addCartStep;
    protected AddInfoStep addInfoStep;
    protected CheckCartStep checkCartStep;
    protected FinishCheckoutStep finishStep;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        loginStep= new LoginStep(driver);
        addCartStep = new AddItemStep(driver);
        checkCartStep = new CheckCartStep (driver);
        addInfoStep = new AddInfoStep(driver);
        finishStep = new FinishCheckoutStep(driver);

        driver.get(ReadProperties.getUrl()); // один раз прописать и больше не надо
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
