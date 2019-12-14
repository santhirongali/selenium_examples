package com.mycompany.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
    @Test
    @Parameters("Browser")
    public void browserType(String browserName) {
        if (browserName.contentEquals("Firefox")) {
            System.out.println("___________  Load Firefox Browser ___________");
        } else if (browserName.contentEquals("Chrome")) {
            System.out.println("___________  Load Chrome ___________");
        }
    }
}
