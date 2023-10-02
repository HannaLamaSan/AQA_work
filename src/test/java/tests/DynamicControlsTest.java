package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.WaitService;

import java.util.List;

public class DynamicControlsTest extends BaseTest {
    @Test
    public void uploadFileTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WaitService waitService = new WaitService(driver);

        WebElement buttonCheckbox  = waitService.waitForExists(By.id("checkbox"));
        buttonCheckbox.isDisplayed();

        WebElement buttonRemove  = waitService.waitForExists(By.cssSelector("#checkbox-example button"));
        buttonRemove.click();

        WebElement messageLocator  = waitService.waitForExists(By.id("message"));
        WebElement CheckBox  = waitService.waitForExists(By.xpath("//*[@id=\"checkbox-example\"]/div[1]"));
        CheckBox.isDisplayed();

        WebElement input = waitService.waitForExists(By.xpath("//*[@id=\"input-example\"]/input"));
        input.isDisplayed();
        Assert.assertTrue(Boolean.parseBoolean(input.getAttribute("disabled")));

        WebElement buttonEnable  = waitService.waitForExists(By.xpath("//*[@id=\"input-example\"]/button"));
        buttonEnable.click();

        WebElement text = waitService.waitForExists(By.xpath("//*[@id=\"input-example\"]/button"));
        text.isDisplayed();

    }
}



