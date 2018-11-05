package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Explorer {

        WebDriver driver = null;

        @Test
        public void suiteTest() throws InterruptedException {
            System.out.println("Launching for IE");
            System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.get("https://www.google.com/");

        }
    }

