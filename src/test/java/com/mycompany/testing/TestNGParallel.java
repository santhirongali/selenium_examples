package com.mycompany.testing;

import org.testng.annotations.Test;

public class TestNGParallel {
    @Test
    public void testCase1() {
        System.out.println("-----In TestCase1");
    }

    @Test
    public void testCase0() {
        System.out.println("-----In Testcase0");
    }

}
