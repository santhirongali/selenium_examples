package com.mycompany.testing;

import org.testng.annotations.Test;

public class TestNGGrouping {

    @Test(groups = {"smokeTest", "FunctionalTest"})
    public void Test1() {
        System.out.println("------- Inside Test1 : smokeTest and FunctionalTest -------");
    }

    @Test(groups = {"SanityTest"})
    public void Test2() {
        System.out.println("------- Inside Test2 : SanityTest -------");
    }

    @Test(groups = {"FunctionalTest"})
    public void Test3() {
        System.out.println("------- Inside Test3 : FunctionalTest-------");
    }

    @Test(groups = {"smokeTest"})
    public void Test4() {
        System.out.println("------- Inside Test4 : smokeTest -------");
    }

    @Test
    public void Test5() {
        System.out.println("------- Inside Test5 -------");
    }

    @Test
    public void Test6() {
        System.out.println("------- Inside Test6 -------");
    }
}
