package com.mycompany.testing;

import com.mycompany.selenium.FBHomePage;
import com.mycompany.selenium.FBLoginPage;
import com.opencsv.CSVReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataDrivenCSV extends TestBase {

    @Test(dataProvider = "CSVFile")
    public void readCSV(String userName, String password) throws IOException, InterruptedException {

        FBLoginPage loginpage = PageFactory.initElements(driver, FBLoginPage.class);
        loginpage.setUsername(userName);
        loginpage.setPassword(password);
        loginpage.clickOnLoginButton();
        Thread.sleep(2000);


        FBHomePage homepage = PageFactory.initElements(driver, FBHomePage.class);
        homepage.clickOnWelcomeDropdown();
        homepage.clickOnLogoutLink();
        Thread.sleep(1000);

    }

    @DataProvider(name = "CSVFile")
    public Object[][] csvReader() throws IOException {
        String loginDetails[][] = null;
        List<User> users = new ArrayList<>();
        try {
            CSVReader dataFileReader = new CSVReader(new FileReader("C:\\Users\\santh\\Sources\\SeleniumWorking\\src\\test\\java\\com\\mycompany\\testing\\DataCSV.csv"));
            String[] celldata;

            while ((celldata = dataFileReader.readNext()) != null) {
                System.out.println("----- inside While");
                String userName = celldata[0];
                System.out.println("First Name" + userName);

                String password = celldata[1];
                System.out.println("Second Name" + celldata[1]);

                User user = new User();
                user.setName(userName);
                user.setPassword(password);
                users.add(user);

            }
            System.out.println(" array " + users);

            loginDetails = new String[users.size()][2];
            for (int i = 0; i < users.size(); i++) {
                loginDetails[i][0] = users.get(i).getName();
                loginDetails[i][1] = users.get(i).getPassword();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("loginDetails> " + loginDetails);
        return loginDetails;
    }
}
