package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;
public class BaseStep
{
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProductPage productsPage;
    protected CartPage cartPage;
    protected CheckOutPage checkOutPage;
    protected FinalCheckoutPage finalCheckoutPage;
    protected CompleteOrderPage completeOrderPage;

    public BaseStep(WebDriver driver)
    {
        this.driver = driver;

        loginPage = new LoginPage(driver);
        productsPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
        finalCheckoutPage = new FinalCheckoutPage(driver);
        completeOrderPage = new CompleteOrderPage(driver);

    }

}
