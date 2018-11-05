package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Navigate {
    WebDriver driver = null;

    @Test()
    public void suiteTest() throws InterruptedException {
        System.out.println("Inside before suite");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.tothenew.com/");
        List<WebElement> list = driver.findElements(By.xpath("//*[@id = 'h-contact-us']"));
        list.get(1).click();
        driver.navigate().back();
        List<WebElement> list1 = driver.findElements(By.id("h-contact-us"));
        list1.get(1).click();
        driver.navigate().forward();



    }
}
