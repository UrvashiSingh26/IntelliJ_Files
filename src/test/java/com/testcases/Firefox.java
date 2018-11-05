package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
    WebDriver driver = null;

    @Test
    public void suiteTest() throws InterruptedException {
        System.out.println("Inside before suite");
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }
}
