package com.mycompany.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver = null;

    @BeforeSuite
    public void initialize() throws IOException, InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");

        driver = new FirefoxDriver();
        //To maximize browser
        driver.manage().window().maximize();
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //To open facebook
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Open the window");
        Thread.sleep(5000);

    }

    @AfterSuite
    //Test cleanup
    public void TeardownTest() {

        System.out.println("Closeing the login page");
        TestBase.driver.quit();
    }
}
