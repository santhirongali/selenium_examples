package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasicXPath {

    public static void main(String[] arg) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

        WebElement searchTxtbox = driver.findElement(By.xpath("//input[@name = 'q']"));
        searchTxtbox.sendKeys("Automation");
        // searchTxtbox.submit();

        //Select Automation anywhere option from the search list
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']//li//descendant::div[@class = 'sbtc']//div"));

        System.out.println("List Size =" + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("List First Value = " + list.get(i).getText());
            if (list.get(i).getText().contains("automation anywhere")) {
                list.get(i).click();
                break;
            }

        }

        Thread.sleep(1000);
        driver.quit();

    }
}
