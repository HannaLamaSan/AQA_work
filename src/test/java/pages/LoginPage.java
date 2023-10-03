package pages;

import baseEntities.BasePage;
import elements.Button;
import elements.Input;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

import java.time.Duration;

public class LoginPage extends BasePage {

    //блок описания локаторов private final By elementNameTypeLocator = By.id("");
    private final By emailInputLocator = By.id("name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("button_primary");
    private final By errorTextLocator = By.className("error-text");
    private final By errorFieldTextLocator = By.className("loginpage-message");

    // Блок инициализации
    public LoginPage(WebDriver driver){

        super(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }

    //блок атомарных методов

    public Input getEmailInput() {
        return new Input(driver, emailInputLocator);
    }

    public Input getPswInput() {
        return new Input(driver, pswInputLocator);
    }

    public boolean isPswInputDisplayed() {
        return getPswInput().isDisplayed();
    }



    public Button getLogInButton() {
        return new Button(driver, logInButtonLocator);
    }

    public void setEmail(String value) {
        getEmailInput().sendKeys(value);
    }

    public WebElement getErrorTextElement() {
        return driver.findElement(errorTextLocator);
    }

    public WebElement getErrorFieldTextElement() {
        return driver.findElement(errorFieldTextLocator);
    }
    //блок комплексных методов
    public void login(String username, String psw) {
        setEmail(username);
        getPswInput().sendKeys(psw);
        getLogInButton().click();
    }
}
