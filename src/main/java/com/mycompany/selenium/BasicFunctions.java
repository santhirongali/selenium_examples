package com.mycompany.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicFunctions {

    public static void main(String[] arg) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://amazon.com");

        /******** Get Title of the page *******/

        String pageTitle = driver.getTitle();

        System.out.println("Page Title is :" + pageTitle);

        /********* Get page source *********/

        String pageSource = driver.getPageSource();

        /************ GetAttribute *********/
        String attributeVal = driver.findElement(By.xpath("//a[@class = 'nav-a  '][.='Find a Gift']")).getAttribute("tabindex");
        System.out.println("Attribute value is :" + attributeVal);

        /******* Refresh the window ************/
        driver.navigate().refresh();

        driver.get(driver.getCurrentUrl());

        driver.navigate().to(driver.getCurrentUrl());

        /******** Forward and Backward **********/
        driver.navigate().forward();
        driver.navigate().back();

        /*********** Get windowHandle *******/
        String windowHndl = driver.getWindowHandle();

        /****** Switchto Window *********/
        driver.switchTo().window(windowHndl);

        /************* How to close First Tab ********/
        // ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        // driver.switchTo().window(tabs2.get(0));
        // driver.close();
        // driver.switchTo().window(tabs2.get(1));


        /************* How to Close Alert Tab ********/

        String windowHndl1 = driver.getWindowHandle();
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Select Ok on Alert Box
        driver.switchTo().window(windowHndl1);

    }

}
