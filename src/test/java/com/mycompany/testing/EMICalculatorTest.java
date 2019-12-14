package com.mycompany.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EMICalculatorTest {
    @Test
    public void EMICalculatorTest() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        Actions action = new Actions(driver);

        WebElement HomeLone = driver.findElement(By.cssSelector("#loanamountslider > span"));
        WebElement intrestRate = driver.findElement(By.cssSelector("#loaninterestslider > span"));
        WebElement loneTenure = driver.findElement(By.cssSelector("#loantermslider > span"));

        action.dragAndDropBy(HomeLone, 83, 0).build().perform();
        Thread.sleep(2000);

        action.dragAndDropBy(intrestRate, 88, 0).build().perform();
        Thread.sleep(3000);

        action.dragAndDropBy(loneTenure, -111, 0).build().perform();
        Thread.sleep(3000);

        WebElement LoanAmount = driver.findElement(By.cssSelector("#emiamount >p > span"));
        String str = LoanAmount.getText();

        System.out.println("----------------------------" + str);
        Assert.assertEquals("93,672", str);
        Thread.sleep(5000);

        driver.quit();

    }
}
