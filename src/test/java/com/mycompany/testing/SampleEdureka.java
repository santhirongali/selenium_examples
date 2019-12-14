package com.mycompany.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SampleEdureka {

    static WebDriver driver;

    @Test
    public void editProfile() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://edureka.co");

        Thread.sleep(1000);

        driver.findElement(By.linkText("Log In")).click();
        Thread.sleep(1000);

        //Move to POPUP Window
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//input[@id ='si_popup_email']")));
        Thread.sleep(1000);
        action.click();

        //Enter Login Details
        action.sendKeys("TestingEdureka@gmail.com");
        Thread.sleep(1000);
        action.build().perform();

        action.moveToElement(driver.findElement(By.xpath("//input[@id = 'si_popup_passwd']")));
        Thread.sleep(1000);
        action.click();

        //Enter Password
        action.sendKeys("12345678");
        Thread.sleep(1000);
        action.build().perform();

        //Click Login button
        action.moveToElement(driver.findElement(By.xpath("//button[@class = 'clik_btn_log btn-block']")));
        Thread.sleep(1000);
        action.click();
        action.build().perform();

    }
}
