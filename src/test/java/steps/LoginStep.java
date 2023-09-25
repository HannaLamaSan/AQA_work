package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductPage;
public class LoginStep extends BaseStep
{

    public LoginStep(WebDriver driver) {
        super(driver);
    }
    public ProductPage successLogin(String username, String psw)
    {
        loginPage.successLogin(username,psw);
        return productsPage;
    }
}