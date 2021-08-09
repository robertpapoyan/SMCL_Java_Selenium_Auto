package PageObjects;

import PageObjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(){
        super();
    }

    @FindBy(css = "a.text-sm:nth-child(1)")
    private WebElement loginPageBtn;

    @FindBy(css = "a.ml-4")
    private WebElement registrationPageBtn;


    public void goToLoginPage(){
        loginPageBtn.click();
    }

    public void goToRegistrationPage(){
        registrationPageBtn.click();
    }

}
