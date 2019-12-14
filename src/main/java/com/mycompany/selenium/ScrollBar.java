package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ScrollBar {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://emicalculator.net/");

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

        WebElement HomeLone = driver.findElement(By.cssSelector("#loanamountslider > span"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.pollingEvery(Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(HomeLone));
        HomeLone.click();

        Actions move = new Actions(driver);
        move.dragAndDropBy(HomeLone, 30, 0).build().perform();

        Thread.sleep(2000);

        driver.quit();
//        move.moveToElement(HomeLone).clickAndHold();
//        move.moveByOffset(30, 0);
//        move.release();
//        move.perform();
    }
}
