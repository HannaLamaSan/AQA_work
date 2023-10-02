package tests;
import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.FramePage;
import pages.UploadPage;
import services.WaitService;

import java.io.File;
import java.util.List;

public class FrameTest extends BaseTest {
@Test
    public void successFileTest() throws InterruptedException {
        WaitService waitService = new WaitService(driver);
        FramePage framePage = new FramePage(driver);
        framePage.openPageByUrl();

        framePage.getFrameLink().click();
        driver.switchTo().frame(framePage.getBoxLocator());

        Assert.assertTrue(waitService.waitForVisibilityLocatedBy(By.id("tinymce")).isDisplayed());
    }

}
