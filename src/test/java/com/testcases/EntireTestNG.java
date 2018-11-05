package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class EntireTestNG {
    WebDriver driver = null;

    @Test
    public void Test1() {
        System.out.println("It's for first test method.");
    }

    @Test
    public void Test2() {
        System.out.println("It's for second test method.");
            }

     @BeforeClass
    public void B4Class () {
         System.out.println("It will come before class.");
     }

     @AfterClass
    public void AfterClass () {
         System.out.println("It will show after class.");
     }

     @BeforeSuite
    public void B4Suite() {
         System.out.println("It should always run before suite.");
     }

     @AfterSuite
    public void AfterSuite() {
         System.out.println("It is after suite so will be in last.");
     }

     @BeforeMethod
    public void B4Method() {
         System.out.println("It is before method.");
     }

     @AfterMethod
    public void AfterMethod() {
         System.out.println("It is after method.");
     }

}
