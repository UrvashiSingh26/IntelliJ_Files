package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class PriortizeTest {
    WebDriver driver = null;

    @Test (priority = 3)
    public void Test3 (){
        System.out.println("It is the last priority");
    }

    @Test(priority = 2)
    public void Test1() {
        System.out.println("It's for first test method but priority is second.");
    }

    @Test (priority = 1)
    public void Test2() {
        System.out.println("It's for second test method but priority is first.");
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
