package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBLoginPage {
    WebDriver driver;
    //Using FindBy for locating elements

    @FindBy(how = How.XPATH, using = "//input[@name = 'txtUsername']")
    WebElement userName;
    @FindBy(how = How.XPATH, using = "//input[@name = 'txtPassword']")
    WebElement password;
    @FindBy(how = How.XPATH, using = "//input[@type= 'submit']")
    WebElement loginBtn;

    public FBLoginPage(WebDriver driver) {
        System.out.println("----------- Inside FBLogin page Constructor");
        this.driver = driver;
    }

    // Defining all the user actions (Methods) that can be performed in the Facebook home page

    // This method is to set Email in the email text box
    public void setUsername(String strUserName) throws InterruptedException {
        userName.sendKeys(strUserName);
        Thread.sleep(2000);
        System.out.println("User  = " + userName.getAttribute("value"));

    }

    // This method is to set Password in the password text box
    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    // This method is to click on Login Button
    public void clickOnLoginButton() {
        loginBtn.click();
    }
}
