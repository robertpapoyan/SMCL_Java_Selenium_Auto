package Tests.RegistrationPageTests;

import PageObjects.RegistrationPage;
import StepsForTests.StepsToOpenRegistrationPage;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRegistrationPage extends BaseTest {


    VerifyRegistrationPage(){
        super();
    }

    @Test
    public void regWidgetIsAvailableTest1() throws InterruptedException {
        StepsToOpenRegistrationPage steps = new StepsToOpenRegistrationPage();
        RegistrationPage registrationPage = new RegistrationPage();

        steps.openRegistrationPage();

        Thread.sleep(3000);

        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://qa.smclk.net/register"));
        Assert.assertTrue(registrationPage.regElementNameField.isDisplayed());
        Assert.assertTrue(registrationPage.regElementEmailField.isDisplayed());
        Assert.assertTrue(registrationPage.regElementPasswordField.isDisplayed());
        Assert.assertTrue(registrationPage.regElementConfirmPasswordField.isDisplayed());

       getDriver().navigate().back();
    }

    @Test
    public void regWidgetIsAvailableTest2() throws InterruptedException {
        StepsToOpenRegistrationPage steps = new StepsToOpenRegistrationPage();
        RegistrationPage registrationPage = new RegistrationPage();

        steps.openRegistrationPage();

        Thread.sleep(3000);

        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://qa.smclk.net/register"));
        Assert.assertTrue(registrationPage.regElementNameField.isDisplayed());
        Assert.assertTrue(registrationPage.regElementEmailField.isDisplayed());
        Assert.assertTrue(registrationPage.regElementPasswordField.isDisplayed());
        Assert.assertTrue(registrationPage.regElementConfirmPasswordField.isDisplayed());
    }
}
