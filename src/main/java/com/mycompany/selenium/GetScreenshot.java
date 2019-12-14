package com.mycompany.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GetScreenshot {
    public static void main(String[] arg) throws IOException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://amazon.com");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        //***** GET Screenshot

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        try {
            File file = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("C:\\Users\\santh\\Desktop\\Screenshot\\test.png"));

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
