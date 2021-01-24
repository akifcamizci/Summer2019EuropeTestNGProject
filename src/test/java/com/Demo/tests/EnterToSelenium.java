package com.Demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterToSelenium {

    @Test
    public void Demo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        driver.navigate().back();

        driver.close();


    }
}
