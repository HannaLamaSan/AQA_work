package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CompleteOrderPage extends BasePage
{
    private final static String pagePath = "/checkout-complete.html";

    private final By checkOutCompleteLocator = By.id("checkout_complete_container");
    private final By finishButtonLocator = By.id("back-to-products");

    public CompleteOrderPage (WebDriver driver)
    {
        super(driver);
    }
    public void openPageByUrl ()
    {
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier()
    {
        return finishButtonLocator;
    }

    public WebElement getCheckOutComplete()
    {
        return driver.findElement(checkOutCompleteLocator);
    }

    public WebElement getFinishButton()
    {
        return driver.findElement(finishButtonLocator);
    }

    public void getHome()
    {
        getFinishButton().click();
    }
}