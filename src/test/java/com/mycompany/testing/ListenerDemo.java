package com.mycompany.testing;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

@Listeners(Listener.class)
public class ListenerDemo {
    @Test
    public void Test1() {
        System.out.println(" ---- Inside Test1 ----");

    }

    @Test
    public void Test2() {
        System.out.println(" ---- Inside Test2 ----");
        assertTrue(false);

    }

    @Test
    public void Test3() {
        System.out.println(" ---- Inside Test3 ----");

    }
}
