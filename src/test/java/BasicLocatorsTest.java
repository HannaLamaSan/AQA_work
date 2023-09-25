import factory.BrowserFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class BasicLocatorsTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void basicLocatorsTest() throws InterruptedException {
        driver.get(ReadProperties.getUrl());
        // ID
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());

        // Name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        // Tag
        driver.findElement(By.id("login-button")).click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // LinkText
        driver.findElement(By.linkText("Sauce Labs Backpack")).isDisplayed();

        driver.findElement(By.tagName("div")).isDisplayed();

        // ClassName
        driver.findElement(By.className("inventory_item_description")).isDisplayed();

        // PartialLinkText
        driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).isDisplayed();
    }

}