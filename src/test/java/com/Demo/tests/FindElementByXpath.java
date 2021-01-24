package com.Demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXpath {
    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        WebElement link1 = driver.findElement(By.xpath("//a[@href= '/exit_intent']"));
        System.out.println(link1.getText());
        link1.click();
        driver.navigate().back();
        WebElement link2 = driver.findElement(By.xpath("//div[@id='flash-messages']"));
        //WebElement link3 = driver.findElement(By.xpath("//span[@class='h1y']"));
        //link3.getText();
        WebElement link4 = driver.findElement(By.xpath("//a[@href= '/dynamic_content']"));
        link4.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
