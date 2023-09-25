package pages;
import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage extends BasePage
{
    private final By usernameInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @Override
    protected By getPageIdentifier()
    {
        return loginButtonLocator;
    }

    public WebElement getUsernameInput()
    {
        return driver.findElement(usernameInputLocator);
    }

    public WebElement getPasswordInput()
    {
        return driver.findElement(pswInputLocator);
    }
    public WebElement getLoginButton()
    {
        return driver.findElement(loginButtonLocator);
    }

    public void successLogin(String username, String password)
    {
        getUsernameInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        getLoginButton().click();
    }
}