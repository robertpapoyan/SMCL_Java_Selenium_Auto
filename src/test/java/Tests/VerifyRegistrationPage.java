package Tests;

import PageObjects.MainPage;
import PageObjects.RegistrationPage;
import PageObjects.VerifyEmailPage;
import StepsForTests.StepsToOpenRegistrationPage;
import StepsForTests.StepsToRegisterAnAccount;
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
        Assert.assertTrue(registrationPage.regElementConfirmCheckbox.isDisplayed());
        Assert.assertFalse(registrationPage.regElementConfirmCheckbox.isSelected());
        Assert.assertTrue(registrationPage.regElementRegButton.isDisplayed());

        getDriver().navigate().back();

    }
    @Test
    public void registerWithCorrectCredentialsTest() throws InterruptedException {
        StepsToOpenRegistrationPage steps = new StepsToOpenRegistrationPage();
        StepsToRegisterAnAccount stepsToRegister = new StepsToRegisterAnAccount();
        VerifyEmailPage inPage = new VerifyEmailPage();

        steps.openRegistrationPage();
        Thread.sleep(1000);
        stepsToRegister.stepsToRegCorrectAccount();

        Assert.assertTrue(inPage.logOut.isDisplayed());
        Assert.assertTrue(inPage.resendEmailBtn.isDisplayed());

    }

    @Test
    public void verifyUserIsLoggedInAfterRegistrationTest() throws InterruptedException {
        MainPage mainPage = new MainPage();
        VerifyEmailPage inPage = new VerifyEmailPage();
        getDriver().get("https://qa.smclk.net");

        mainPage.goToLoginPage();

        Thread.sleep(2000);


        Assert.assertTrue(inPage.logOut.isDisplayed());
        Assert.assertTrue(inPage.resendEmailBtn.isDisplayed());
    }
}
