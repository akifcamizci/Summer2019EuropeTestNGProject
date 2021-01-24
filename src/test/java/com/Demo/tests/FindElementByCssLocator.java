package com.Demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementByCssLocator {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=  new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");

        WebElement link1 = driver.findElement(By.xpath("//a[@href= '/registration_form']"));
        link1.click();
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Jousef");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Camizci");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("akifcamizci");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("akifcamizci@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("21151298");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("419-444-3322");
        driver.findElement(By.cssSelector(" input[value='male']")).click();
        Thread.sleep(500);

        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("01/01/1981");


        Select select2 = new Select(driver.findElement(By.cssSelector("select[name='department']")));
        Thread.sleep(500);
        select2.selectByVisibleText("MCR");

        Select select = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        Thread.sleep(500);
        select.selectByVisibleText("SDET");
        driver.findElement(By.cssSelector("input[id='inlineCheckbox1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[id='wooden_spoon']")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
