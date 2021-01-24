package com.Demo.tests;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.*;

public class Test2 {

    @BeforeTest
    public void BTest(){
        System.out.println("Before Test Annotation");
    }
    @BeforeClass
    public void BClass(){
        System.out.println("Before Class Annotation");
    }
    @BeforeMethod
    public void BMethod() {
        System.out.println("Before Method Annotation");
    }
    @BeforeSuite
    public void BSuite() {
        System.out.println("Before Suite Annotation");
    }
    @Test
    public void Test1(){
        System.out.println("Test 1");
    }
    @Test
    public void Test2(){
        System.out.println("Test2");
    }
    @AfterTest
    public void TestAfter(){
        System.out.println("After Test Annotation");
    }
    @AfterTest
    public void TestAfter2(){
        System.out.println("After Test2 Annotation");
    }
    @AfterClass
    public void TestClass(){
        System.out.println("After Class Annotation");
    }
    @AfterMethod
    public void TestMethod(){
        System.out.println("After Method Annotation");
    }
    @AfterSuite
    public void TestSuite(){
        System.out.println("After Suite Annotation");
    }
    @Test
    public void Test5(){
        System.out.println("Test 3");
    }
}
