package pages;
import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CartPage extends BasePage
{
    private final static String pagePath = "cart.html";
    private final By cartTitleLocator = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By checkoutButtonLocator = By.id("checkout");

    public CartPage(WebDriver driver)
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
        return cartTitleLocator;
    }

   public WebElement getHeaderCartTitleInput()
   {
        return driver.findElement(cartTitleLocator);
    }

    public WebElement getCheckoutButtonInput()
    {
        return driver.findElement(checkoutButtonLocator);
    }

    public void checkCart()
    {
        getCheckoutButtonInput().click();
    }

}