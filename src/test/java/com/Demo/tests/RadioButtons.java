package com.Demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.findElement(By.xpath("//input[@id='red']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='black']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='blue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='yellow']")).click();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='color']"));

       for(WebElement button: radioButtons)
           System.out.println(button.isSelected());
        driver.quit();

    }
}
