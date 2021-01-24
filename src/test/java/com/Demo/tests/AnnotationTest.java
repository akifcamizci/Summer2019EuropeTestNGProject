package com.Demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
    WebDriver driver;
    String Title;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Test1(){
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        Title= driver.getTitle();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("Title = " + Title);
    }
    @AfterMethod
    public void Close() throws InterruptedException {
       Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void Amazon(){
        driver.get("https://amazon.com");
        driver.getTitle();
        Title=driver.getCurrentUrl();
        System.out.println("Title = " + Title);
    }

}
