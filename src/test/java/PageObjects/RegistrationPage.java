package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(){
        super();
    }

    @FindBy(id = "name")
    public WebElement regElementNameField;

    @FindBy(id = "email")
    public WebElement regElementEmailField;

    @FindBy(id = "password")
    public WebElement regElementPasswordField;

    @FindBy(id = "password_confirmation")
    public WebElement regElementConfirmPasswordField;

    public void regElementNameFieldClick(){
        regElementNameField.click();
    }

    public void regElementEmailFieldClick(){
        regElementEmailField.click();
    }

    public void regElementPasswordFieldClick(){
        regElementPasswordField.click();
    }

    public void regElementConfirmPasswordFieldClick(){
        regElementConfirmPasswordField.click();
    }
}
