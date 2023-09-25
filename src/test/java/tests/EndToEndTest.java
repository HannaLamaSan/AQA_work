package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
public class EndToEndTest extends BaseTest {

    @Test
    public void successTest()  {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened();
        addCartStep.successAddCart().isPageOpened();
        checkCartStep.successCheckCart().isPageOpened();
        addInfoStep.successInfo(ReadProperties.FirstName(), ReadProperties.LastName(), ReadProperties.PostalCode()).isPageOpened();
        Assert.assertTrue(finishStep.successFinish().isPageOpened());
    }
}
