package com.mycompany.testing;

import org.testng.annotations.Test;

public class DisableTest {
    @Test(priority = 1)
    public void Test1() {
        System.out.println(" -----Inside Test1 -----");
    }

    @Test(priority = 3)
    public void Test2() {
        System.out.println(" -----Inside Test2 -----");
    }

    @Test(enabled = false)
    public void Test3() {
        System.out.println(" -----Inside Test3 -----");
    }

    @Test(priority = 2)
    public void Test4() {
        System.out.println(" -----Inside Test4 -----");
    }
}
