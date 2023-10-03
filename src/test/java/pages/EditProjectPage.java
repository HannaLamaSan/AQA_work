package pages;

import baseEntities.BasePage;
import elements.Table;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProjectPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/edit/2";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.className("page_title");
    private final By checkBoxLocator = By.id("show_announcement");
    private final By radioButtonTableLocator = By.id("suite_mode_single_baseline");

    // Блок инициализации
    public EditProjectPage(WebDriver driver) {
        super(driver);

    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabelLocator);
    }

    public RadioButton getRadioButtonTable() {
        return new RadioButton(driver, radioButtonTableLocator);

    }

}