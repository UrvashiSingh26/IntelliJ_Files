package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckTitle {
    WebDriver driver = null;

    @Test()
    public void suiteTest() {
        System.out.println("Check the title");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.tothenew.com/contact-us");
        String str = driver.getTitle();
        System.out.println("The title is: " + str);
        boolean b = driver.getTitle().equals("Contact us - Please fill in the form | TO THE NEW");
        System.out.println(b);
    }
}
