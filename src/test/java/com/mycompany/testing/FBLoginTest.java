package com.mycompany.testing;

import com.mycompany.selenium.FBHomePage;
import com.mycompany.selenium.FBLoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FBLoginTest extends TestBase {
    @Test
    public void init() throws Exception {

        FBLoginPage loginpage = PageFactory.initElements(driver, FBLoginPage.class);
        loginpage.setUsername("Admin");
        loginpage.setPassword("admin123");
        loginpage.clickOnLoginButton();

        Thread.sleep(2000);
        FBHomePage homepage = PageFactory.initElements(driver, FBHomePage.class);
        homepage.clickOnWelcomeDropdown();
        homepage.clickOnLogoutLink();
        Thread.sleep(1000);
    }
}
