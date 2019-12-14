package com.mycompany.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
    @Test(dataProvider = "Data1")
    public void dataprovidercaller(String data) {

        System.out.println("---- InsideDataProviderCaller " + data);
    }

    @DataProvider(name = "Data1")
    public Object[][] dataprovider() {
        System.out.println(" ---- Inside Dataprovider");

        return new Object[][]{{"Input1"}, {"Input2"}};

    }
}
