package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasePage extends BasePage {
    private final static String pagePath = "/index.php?/cases/add/1";

    // Блок описания локаторов для элементов
    private final By headerTitleLocator = By.className("page_title");
    private final By dropDownLocator = By.id("priority_id_chzn");
    private final By textDropDownLocator = By.id("priority_id_chzn_o_1");

    // Блок инициализации

    public TestCasePage(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLocator);
    }
    public WebElement getdropDown() {
        return waitService.waitForExists(dropDownLocator);
    }
    public WebElement gettextDropDown() {
        return waitService.waitForExists(textDropDownLocator);
    }
    public void dropdown(){
        getdropDown().click();
        gettextDropDown().click();
    }
    @Override
    protected By getPageIdentifier() {
        return null;
    }
}
