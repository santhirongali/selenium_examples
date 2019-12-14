package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] arg) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Binaries\\geckodriver-v0.26.0\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.guru99.com/test/newtours/register.php");

        WebElement countryDropdown = driver.findElement(By.xpath("//select[@name = 'country']"));
        Select countrySelect = new Select(countryDropdown);

        countrySelect.selectByVisibleText("INDIA");

    }
}
