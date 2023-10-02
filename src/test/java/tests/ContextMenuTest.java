package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest {

    @Test
    public void infoContextMenuTest() {
        Actions actions = new Actions(driver);
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        contextMenuPage.openPageByUrl();

        actions
                .contextClick(contextMenuPage.getBox())
                .build()
                .perform();
        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "You selected a context menu");

        alert.dismiss();
    }
}

