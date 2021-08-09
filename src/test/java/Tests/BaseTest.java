package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public  abstract class BaseTest{

    private static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }
   @BeforeClass
    public static void baseSetup() throws InterruptedException {
       File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();

        driver.get("https://qa.smclk.net/");
        driver.manage().window().maximize();

        Thread.sleep(3000);
    }

    @AfterClass
    public static void finishOperationsByQuit(){
        driver.quit();
    }



}

