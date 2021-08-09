package Tests;

import PageObjects.LoginPage;
import PageObjects.VerifyEmailPage;
import StepsForTests.StepsToLogin;
import StepsForTests.StepsToOpenLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPage extends BaseTest{

    VerifyLoginPage (){
        super();
    }



    @Test
    public void loginWidgetIsAvailableTest1() throws InterruptedException {
        StepsToOpenLoginPage steps = new StepsToOpenLoginPage();
        LoginPage loginPageObjects = new LoginPage();
        StepsToLogin stepsToLogin = new StepsToLogin();

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
    public void loginWithEmptyCredentialsTest2(){
        StepsToOpenLoginPage steps = new StepsToOpenLoginPage();
        LoginPage loginPageObjects = new LoginPage();
        steps.openLoginPage();
        loginPageObjects.loginElementLoginButtonClick();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://qa.smclk.net/login"));
        Assert.assertTrue(loginPageObjects.loginElementEmailField.isDisplayed());
        Assert.assertTrue((loginPageObjects.loginElementPasswordField.isDisplayed()));
        Assert.assertTrue(loginPageObjects.loginElementForgotPassword.isDisplayed());
        Assert.assertTrue(loginPageObjects.loginElementRememberMeCheckbox.isDisplayed());
        Assert.assertFalse(loginPageObjects.loginElementRememberMeCheckbox.isSelected());
        Assert.assertTrue(loginPageObjects.loginElementLoginButton.isDisplayed());
    }

    @Test
    public void loginWithCorrectCredentialsTest3() throws InterruptedException {
        StepsToOpenLoginPage steps = new StepsToOpenLoginPage();
        StepsToLogin stepsToLogin = new StepsToLogin();
        VerifyEmailPage inPage = new VerifyEmailPage();

        steps.openLoginPage();
        stepsToLogin.enterCorrectCredentials();
        Thread.sleep(2000);
        Assert.assertTrue(inPage.logOut.isDisplayed());
        Assert.assertTrue(inPage.resendEmailBtn.isDisplayed());

        inPage.logOut.click();
        Thread.sleep(1500);
    }
}
