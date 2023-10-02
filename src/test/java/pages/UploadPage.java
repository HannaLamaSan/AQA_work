package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage extends BasePage {
    private final static String pagePath = "/upload";
    // Блок описания локаторов для элементов
    private final By buttonUploadLocator = (By.id("file-upload"));
    private final By buttonSubmitLocator = (By.id("file-submit"));
    private final By labelUploadedLocator = By.id("uploaded-files");
    // Блок инициализации
    public UploadPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return buttonUploadLocator;
    }

    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    // Блок атомарных методов

    public WebElement getButtonSubmit() {
        return waitService.waitForExists(buttonSubmitLocator);
    }
    public WebElement getButtonUpload() {
        return waitService.waitForExists(buttonUploadLocator);
    }
    public WebElement getLabelUploaded() {
        return waitService.waitForExists(labelUploadedLocator);
    }

}
