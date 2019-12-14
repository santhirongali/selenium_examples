package com.mycompany.testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriority {
    @Test
    public void testCase1() {
        System.out.println("-----In TestCase1");
    }

    @BeforeTest
    public void testCase0() {
        System.out.println("-----In Testcase0");
    }

    @Test(priority = 1)
    public void testCase2() {
        System.out.println("------In Testcase2");
    }

}
