package tests;

import baseEntities.BaseTest;
import elements.CheckBox;
import helper.DataHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.AddTestCasePage;
import pages.TestCasePage;
import utils.configuration.ReadProperties;

public class WrappersTestHOMEWORK extends BaseTest {

    @Test
    public void testCheckBox_hw() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        CheckBox checkBox1 = new CheckBox(driver,By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        CheckBox checkBox2 = new CheckBox(driver,By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        checkBox1.set();
        checkBox2.remove();
    }

    @Test
    public void dropdownTest() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );
        TestCasePage testCasePage = new TestCasePage(driver);
        testCasePage.openPageByUrl();
        testCasePage.dropdown();
        testCasePage.gettextDropDown();
    }
    @Test
    public void RadioButton_hw() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectPage addProjectsPage = new AddProjectPage(driver);
        addProjectsPage.openPageByUrl();
        addProjectsPage.getProjectType().selectByIndex(0);
        Thread.sleep(1400);
        addProjectsPage.getProjectType().selectByText("Use multiple test suites to manage cases");
        addProjectsPage.getProjectType().selectByValue("1");
    }

}