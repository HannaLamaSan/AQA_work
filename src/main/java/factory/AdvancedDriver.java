package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvancedDriver {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        return new ChromeDriver(getOptions());//возврат в конструктор
    }

    public ChromeOptions getOptions() {//возм добавлять параметры до момента инит браузера
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(false);//брауз работает в памяти, но виз не запускается
        //донастрока перед стартом
        chromeOptions.addArguments("--disable-gpu");//инфа в chrome arg selenium
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--silent");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");//реж инкогнито

        return chromeOptions;
    }
}