package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver = null;

    @Test()                      //@Test ye use karte hai immediate run krwane k liye
public void suiteTest() throws InterruptedException {
    System.out.println("Inside before suite");
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
       String str = driver.getTitle();
        System.out.println("The title is: " + str);
        driver.manage().window().maximize();
        System.out.println("Inside it");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id= 'lst-ib']")).click();
        driver.findElement(By.xpath("//*[@id= 'lst-ib']")).sendKeys("To The New");
        driver.findElement(By.xpath("//*[@id= 'lst-ib']")).sendKeys(Keys.ENTER);
}

}
