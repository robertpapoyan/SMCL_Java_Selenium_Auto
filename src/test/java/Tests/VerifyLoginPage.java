package Tests;

import PageObjects.LoginPage;
import StepsForTests.StepsToLogin;
import StepsForTests.StepsToOpenLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPage extends BaseTest{

    VerifyLoginPage (){
        super();
    }

    @Test
    public void loginWidgetIsAvailableTest() throws InterruptedException {
        StepsToOpenLoginPage steps = new StepsToOpenLoginPage();
        LoginPage loginPageObjects = new LoginPage();

        steps.openLoginPage();

        Thread.sleep(2000);

        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://qa.smclk.net/login"));
        Assert.assertTrue(loginPageObjects.loginElementEmailField.isDisplayed());
        Assert.assertTrue((loginPageObjects.loginElementPasswordField.isDisplayed()));
        Assert.assertTrue(loginPageObjects.loginElementForgotPassword.isDisplayed());
        Assert.assertTrue(loginPageObjects.loginElementRememberMeCheckbox.isDisplayed());
        Assert.assertFalse(loginPageObjects.loginElementRememberMeCheckbox.isSelected());
        Assert.assertTrue(loginPageObjects.loginElementLoginButton.isDisplayed());

        getDriver().navigate().back();

    }

    @Test
    public void loginWithCorrectCredentialsTest() throws InterruptedException {
        StepsToLogin stepsToLogin = new StepsToLogin();
        StepsToOpenLoginPage steps = new StepsToOpenLoginPage();
        steps.openLoginPage();
        stepsToLogin.enterCorrectCredentials();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://qa.smclk.net/email/verify"));
    }
}
