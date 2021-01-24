package com.Demo.tests;

import com.sun.xml.internal.ws.resources.UtilMessages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageTitle {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("http://google.com");

        String title = driver.getTitle();
        System.out.println(title);

        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        btn1.click();
        Thread.sleep(2000);

        driver.quit();




    }
}
