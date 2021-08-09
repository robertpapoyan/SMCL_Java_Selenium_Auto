package StepsForTests;

import PageObjects.LoginPage;


public class StepsToLogin {
    LoginPage loginPage = new LoginPage();

    public void enterCorrectCredentials() throws InterruptedException {
        loginPage.loginElementEmailFieldClick();
        loginPage.loginElementEmailField.sendKeys("asdasd@asd.am");
        loginPage.loginElementPasswordFieldClick();
        loginPage.loginElementPasswordField.sendKeys("asdasd12");
        loginPage.loginElementLoginButtonClick();
        Thread.sleep(3000);
    }
}
