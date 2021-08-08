package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static Tests.BaseTest.getDriver;

public abstract class BasePage {
    public WebDriver driver;

    public BasePage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }
}
