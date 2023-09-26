package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FinalCheckoutPage extends BasePage
{
    private final static String pagePath = "/checkout-step-two.html";
    private final By finalCheckoutLocator = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By finishButtonLocator = By.id("finish");

    public FinalCheckoutPage(WebDriver driver)
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
        return finalCheckoutLocator;
    }

    public WebElement getCheckOutOverNew()
    {
        return driver.findElement(finalCheckoutLocator);
    }

    public WebElement getFinishButton()
    {
        return driver.findElement(finishButtonLocator);
    }

    public void getPayment()
    {
        getFinishButton().click();
    }
}