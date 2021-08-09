package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyEmailPage extends BasePage {
    public VerifyEmailPage(){
        super();
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form[1]/div/button")
    public WebElement resendEmailBtn;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form[2]/button")
    public WebElement logOut;


}
