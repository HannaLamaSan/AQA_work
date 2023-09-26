package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
public class CheckCartStep extends BaseStep
{
    public CheckCartStep(WebDriver driver)
    {
        super(driver);
    }

    public CartPage successCheckCart()
    {
        cartPage.checkCart();
        return cartPage;
    }
}