package com.mycompany.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PageScroll {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://amazon.com");

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        Actions action = new Actions(driver);

        //Scroll to end of the page
        action.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).perform();

        //Scroll to top of the page
        action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();


    }
}
