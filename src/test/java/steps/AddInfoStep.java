package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CheckOutPage;

public class AddInfoStep extends BaseStep
{


    public AddInfoStep(WebDriver driver)
    {
        super(driver);
    }

    public CheckOutPage successInfo(String FirstName, String LastName, String PostalCode)
    {
        checkOutPage.getInfo(FirstName,LastName,PostalCode);
        return checkOutPage;
    }
}
