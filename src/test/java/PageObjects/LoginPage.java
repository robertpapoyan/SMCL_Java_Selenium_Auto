package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(){
        super();
    }

    @FindBy(id = "email")
    public WebElement loginElementEmailField;

    @FindBy(id = "password")
    public WebElement loginElementPasswordField;

    @FindBy(id = "remember_me")
    public WebElement loginElementRememberMeCheckbox;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div[4]/a")
    public WebElement loginElementForgotPassword;

    @FindBy(css = ".inline-flex")
    public WebElement loginElementLoginButton;

    public void loginElementEmailFieldClick(){
        loginElementEmailField.click();
    }

    public void loginElementPasswordFieldClick(){
        loginElementPasswordField.click();
    }

    public void loginElementRememberMeCheckboxClick(){
        loginElementRememberMeCheckbox.click();
    }

    public void loginElementForgotPasswordClick(){
        loginElementForgotPassword.click();
    }

    public void loginElementLoginButtonClick(){
        loginElementLoginButton.click();
    }
}
