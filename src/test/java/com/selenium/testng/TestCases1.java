package com.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestCases1 {
    @BeforeClass
    public void beforeClassTest(){
        System.out.println("Before Class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
   @Test(groups = "smoke")
    public void addNumber(){
       int sum = 10+10;
       Assert.assertEquals(sum,21);
   }
//    @Test
//    public void subNumber(){
//        int sub = 15-5;
//        Assert.assertEquals(sub,20);
//    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }
}
