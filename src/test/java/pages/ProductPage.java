package pages;
import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductPage extends BasePage
{
    private final static String pagePath = "/inventory.html";
    private final By headerTitleLocator = By.xpath("//div[text() = 'Swag Labs']");
    private final By addBackpackButtonLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By addTshirtButtonLocator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By shoppingCartLocator = By.id("shopping_cart_container");

    public ProductPage(WebDriver driver)
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
        return headerTitleLocator;
    }

    public WebElement getAddBackpackInput()
    {
        return driver.findElement(addBackpackButtonLocator);
    }

    public WebElement getAddTshirtInput()
    {
        return driver.findElement(addTshirtButtonLocator);
    }

    public WebElement getShoppingCartInput()
    {
        return driver.findElement(shoppingCartLocator);
    }

    public void addToCart()
    {
        getAddBackpackInput().click();
        getAddTshirtInput().click();
        getShoppingCartInput().click();
    }

}