import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class CssSelectorsTest {
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
    public void cssSelectorsTest() {

        driver.get("file:D:\\AQA_work\\src\\test\\resources\\index.html");


        // Поиск по id
        Assert.assertTrue(driver.findElement(By.cssSelector("#iframeResult")).isDisplayed());
        //   аналог
        Assert.assertTrue(driver.findElement(By.id("iframeResult")).isDisplayed());

        // Поиск по class name
        Assert.assertTrue(driver.findElement(By.cssSelector(".result_output")).isDisplayed());
        //   аналог
        Assert.assertTrue(driver.findElement(By.className("result_output")).isDisplayed());

        // Поиск по нескольким значения в аттрибуте class
        Assert.assertTrue(driver.findElement(By.cssSelector(".noSel.newsletter")).isDisplayed());

        // Поиск по tag name
        Assert.assertTrue(driver.findElement(By.cssSelector("h4")).isDisplayed());
        //   аналог
        Assert.assertTrue(driver.findElement(By.tagName("h4")).isDisplayed());

        // Поиск по tag и значению из аттрибута class
        Assert.assertTrue(driver.findElement(By.cssSelector("div.result_output")).isDisplayed());

        // Поиск по id и значению из аттрибута class
        Assert.assertEquals(1, driver.findElements(By.cssSelector("#selectorResult.noSel")).size());

        // Поиск всех элементов с тэгом h1 или p
        Assert.assertEquals(9, driver.findElements(By.cssSelector("h4, p")).size());

        // Поиск всех элементов с тэгом p у которых непосредственный родитель с тэгом div
        Assert.assertEquals(1, driver.findElements(By.cssSelector("div > h3")).size());

        // Поиск всех элементов с тэгом p которые идут сразу за элементом с тэго ul
        Assert.assertEquals(1, driver.findElements(By.cssSelector("ul + p")).size());

        // Поиск всех элементов с тэгом div которые являются братьями элементу с тэгом p
        Assert.assertEquals(2, driver.findElements(By.cssSelector("p ~ div")).size());

        // Поиск всех элементов у которых присутствует аттрибут title
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title]")).size());

        // Поиск всех элементов у которых присутствует аттрибут style с конкретным значением
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[style = 'padding:5px;']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением заканчивающимся на какое-то value
        Assert.assertEquals(2, driver.findElements(By.cssSelector("[id$='ult']")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то value
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id^=s]")).size());

        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то слово
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id|=my]")).size());

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим слово целиком
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title~=Hello]")).size());

        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим какой текст
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[title*=Hel]")).size());

        // Поиск всех disabled элементов
        Assert.assertEquals(1, driver.findElements(By.cssSelector(":disabled")).size());

        // Поиск всех enabled элементов
        Assert.assertEquals(8, driver.findElements(By.cssSelector(":enabled")).size());

        // Поиск всех выборанных элементов
        Assert.assertEquals(2, driver.findElements(By.cssSelector(":checked")).size());

        // Поиск всех элементов c пустым телом
        Assert.assertEquals(16, driver.findElements(By.cssSelector(":empty")).size());

        // Поиск элемента с тэгом p и которым является первым дочерним элементом
        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:first-child")).size());

        // Поиск элемента с тэгом p и которым является последним дочерним элементом
        Assert.assertEquals(2, driver.findElements(By.cssSelector("p:last-child")).size());

        // Поиск элемента с тэгом p и которым является n-ым дочерним элементом
        Assert.assertEquals(1, driver.findElements(By.cssSelector("p:nth-child(7)")).size());

    }
}