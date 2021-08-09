package PageObjects;

import PageObjects.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(){
        super();
    }

    @FindBy(xpath = "/html/body/div/div[1]/a[1]")
     public WebElement loginPageBtn;

    @FindBy(xpath = "/html/body/div/div[1]/a[2]")
     public WebElement registrationPageBtn;


    public void goToLoginPage(){
        loginPageBtn.click();
    }

    public void goToRegistrationPage(){
        registrationPageBtn.click();
    }

}
