package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHomePage {
    WebDriver driver;
//    //Using FindBy for locating elements
//    @FindBy(how = How.XPATH, using = "//div[text()='Account Settings']")
//    WebElement profileDropdown;
//    @FindBy(how = How.XPATH, using = "//text()[.='Log Out']/ancestor::span[1]")
//    WebElement logoutLink;
//    @FindBy(how = How.XPATH, using = "///div[text()='Good afternoon, SoftwareTesting!']")
//    WebElement loggedInUserNameText;


    @FindBy(how = How.XPATH, using = "//a[@id = 'welcome']")
    WebElement welcomedropDown;

    @FindBy(how = How.XPATH, using = "//a[. = 'Logout']")
    WebElement logoutLink;


    public FBHomePage(WebDriver driver) {
        this.driver = driver;
    }


    // Defining all the user actions (Methods) that can be performed in the Facebook home page

    // This method to click on Profile Dropdown
    public void clickOnWelcomeDropdown() throws InterruptedException {
        System.out.println("------ Inside dropdown method");

        welcomedropDown.click();
//       Actions action = new Actions(driver);
//       action.moveToElement(welcomedropDown).perform();
//       action.click().perform();
        Thread.sleep(2000);

    }

    // This method to click on Logout link
    public void clickOnLogoutLink() {
        logoutLink.click();
//        Actions action = new Actions(driver);
//        action.moveToElement(logoutLink).perform();
//        action.click().perform();

    }

}
