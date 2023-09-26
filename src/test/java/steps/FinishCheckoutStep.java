package steps;
import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.FinalCheckoutPage;

public class FinishCheckoutStep extends BaseStep {
    public FinishCheckoutStep(WebDriver driver) {
        super(driver);
    }

    public FinalCheckoutPage successFinish() {
        finalCheckoutPage.getPayment();
        return finalCheckoutPage;
    }
}