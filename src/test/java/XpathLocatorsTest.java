import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class XpathLocatorsTest {
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
    public void basicXpathLocatorsTest() {
        driver.get(ReadProperties.getUrl());

        // Абсолютный xpath
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).isDisplayed());// это полный (full) путь, выбираем эл.- copy- copy full xpath

        // Все элементы на странице начина с HTML
        driver.findElements(By.xpath("//*"));

        // Аналог поиска по tagName
        Assert.assertTrue(driver.findElement(By.xpath("//h4")).isDisplayed());

        // Аналог родительского div и на один уровень ниже р1
        Assert.assertTrue(driver.findElement(By.xpath("//div/h4")).isDisplayed());

        // Аналог родительского div и на любом уровене ниже div
        Assert.assertTrue(driver.findElement(By.xpath("//div//div")).isDisplayed());

        // Поиск элемента с тэгом div у которого есть аьттрибут id
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id]")).isDisplayed());

        // Поиск элемента у которого есть аттрибут id cо значением top-logo
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'login-button']")).isDisplayed());

        // Поиск элемента у которого есть аттрибут method cо значением и aттрибут target со значением
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='input_error form_input' and @placeholder='Username']")).isDisplayed());

        // Поиск элемента у которого значение аттрибута начинается с starts-with, а дальше так
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@placeholder, 'Username')]")).isDisplayed());

        // Поиск элемента у которого значение аттрибута содержит подстроку (contains)
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@placeholder, 'Username')]")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит равно
        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'Swag Labs']")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'usernames are')]")).isDisplayed());

        // Поиск элемента по индексу
        Assert.assertTrue(driver.findElement(By.xpath("//div[2]")).isDisplayed());
    }
    @Test
    public void axesXPathTest() {
        driver.get("https://www.saucedemo.com/inventory.html");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Поиск родителя у элемента с тэгом h1

        Assert.assertTrue(driver.findElement(By.xpath("//h4/parent::div")).isDisplayed());

        // Поиск всех предков с тэгом div у элемента с тэгом h1
        Assert.assertTrue(driver.findElement(By.xpath("//h4/ancestor::div")).isDisplayed());

        driver.findElement(By.id("login-button")).click();

        // Использование child - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//div/child::span")).isDisplayed());

        // Использование child - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//div/descendant::div")).isDisplayed());

        //Использование following - Выбирает всё в документе после закрытия тэга текущего узла
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='shopping_cart_container']/following::span")).isDisplayed());
    }

}