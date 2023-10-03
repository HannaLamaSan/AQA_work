package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginStep extends BaseStep {

    public LoginStep(WebDriver driver) {
        super(driver);
    }

    @Step
    public LoginPage successLogin(String username, String password) {
        loginPage.login(username, password);

        return loginPage;
    }

    public LoginPage negativeLogin(String username, String password) {
        loginPage.login(username, password);

        return loginPage;
    }
}