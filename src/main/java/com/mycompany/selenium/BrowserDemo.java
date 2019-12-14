package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserDemo {
    public static void main(String[] args) {
        System.out.println("Selenium Test...");

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Binaries\\chromedriver\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/search?ei=h1LtXba6I9Ha-gTGk73gCg&q=types+of+automation&oq=automation&gs_l=psy-ab.1.0.0i71l8.0.0..3536...0.3..0.0.0.......0......gws-wiz.zJG01qpKRq8");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("automation");
        driver.findElement(By.xpath("//button[@class='Tg7LZd']")).click();

        //How to select the textbox text

        Actions action = new Actions(driver);
        action.doubleClick(driver.findElement(By.name("q"))).build().perform();

        driver.close();
    }
}
