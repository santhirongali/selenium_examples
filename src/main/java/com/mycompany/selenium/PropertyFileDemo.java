package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PropertyFileDemo {
    public static void main(String[] arg) throws InterruptedException {

        File file = new File("C:\\Users\\santh\\Sources\\SeleniumWorking\\src\\main\\java\\com\\mycompany\\selenium\\UsrDataPropertyFile.properties");

        FileInputStream fileStream = null;

        try {
            fileStream = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties propFile = new Properties();

        //Load Property File
        try {
            propFile.load(fileStream);

        } catch (IOException e) {
            e.printStackTrace();

        }

        String URL = propFile.getProperty("URL");
        String userName = propFile.getProperty("UserName");
        String password = propFile.getProperty("Password");

        System.out.println("Property File Values " + URL);
        System.out.println("Property File Values " + userName);
        System.out.println("Property File Values " + password);
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(URL);

        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

        WebElement user = driver.findElement(By.xpath("//input[@name = 'txtUsername']"));
        WebElement passwrd = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type= 'submit']"));

        user.sendKeys(userName);
        passwrd.sendKeys(password);
        loginBtn.click();


    }
}
