package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextMenuPage extends BasePage {
    private final static String pagePath = "/context_menu";
    // Блок описания локаторов для элементов

    private final By boxLocator = By.xpath("//*[@id=\"hot-spot\"]");
    // Блок инициализации
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return boxLocator;
    }

    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    // Блок атомарных методов

    public WebElement getBox() {
        return waitService.waitForExists(boxLocator);
    }
}
