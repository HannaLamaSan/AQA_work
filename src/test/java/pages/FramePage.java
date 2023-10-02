package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePage extends BasePage {
    private final static String pagePath = "/frames";
    // Блок описания локаторов для элементов

    private final By frameLinkLocator = (By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a"));
    private final By boxLocator = (By.id("mce_0_ifr"));
    private final By textLocator = (By.id("tinymce"));


    // Блок инициализации
    public FramePage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return frameLinkLocator;
    }
    public void openPageByUrl () {
        super.openPageByUrl(pagePath);
    }
    // Блок атомарных методов

    public WebElement getFrameLink() {
        return driver.findElement(frameLinkLocator);
    }
    public WebElement getBoxLocator() {
        return waitService.waitForExists(boxLocator);
    }

    public WebElement getTextLocator() {
        return waitService.waitForExists(textLocator);
    }

}
