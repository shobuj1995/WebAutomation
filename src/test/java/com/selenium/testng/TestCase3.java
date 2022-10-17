package com.selenium.testng;

import org.testng.annotations.Test;

public class TestCase3 {
    @Test(groups = "smoke")
    public void test1(){System.out.println("TestCases 1");}
    @Test
    public void test2(){
        System.out.println("TestCases 2");
    }
    @Test
    public void test3(){
        System.out.println("TestCases 3");
    }

}
