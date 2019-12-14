package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.edureka.co/");

        Thread.sleep(5000);

        WebElement menu = driver.findElement(By.xpath("//a[@class = 'cat_btn hidden-xs giTrackElementHeader']"));

        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        Thread.sleep(2000);

        WebElement subMenu1 = driver.findElement(By.xpath("//a[@class = 'open_submenu_on_hover giTrackElementHeader'][.= 'Cloud Computing']"));
        action.moveToElement(subMenu1).perform();
        Thread.sleep(2000);

        WebElement subMenu2 = driver.findElement(By.xpath("//a[@class = 'course_submenu'][. = ' Cloud Architect Masters Program']"));
        action.moveToElement(subMenu2).perform();
        Thread.sleep(3000);
        subMenu2.click();

    }
}
