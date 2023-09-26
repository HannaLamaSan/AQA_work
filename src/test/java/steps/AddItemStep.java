package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductPage;
public class AddItemStep extends BaseStep
{

    public AddItemStep(WebDriver driver) {
        super(driver);
    }

    public ProductPage successAddCart()
    {
        productsPage.addToCart();
        return productsPage;
    }
}