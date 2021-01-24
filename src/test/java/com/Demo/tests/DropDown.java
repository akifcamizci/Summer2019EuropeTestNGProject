package com.Demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    static WebDriver driver = BrowserFactory.getDriver();
    public static void main(String[] args) throws Exception {

       SimpleDropDown();
       SelectByValue();
       MultipleSelection();
       MultipleSelection();
       InvisibleDropDown();
    }
    public static void setup(){

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    public static void SimpleDropDown() throws Exception {
        setup();
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 2");
        Thread.sleep(2000);
        driver.quit();

    }

    public static void SelectByValue() throws Exception{

        setup();
        Select selectyear = new Select(driver.findElement(By.id("year")));
        selectyear.selectByValue("2012");
        Thread.sleep(1000);
        Select selectmonth = new Select(driver.findElement(By.id("month")));
        selectmonth.selectByValue("4");
        Thread.sleep(1000);
        Select selectday = new Select(driver.findElement(By.id("day")));
        selectday.selectByValue("21");
        Thread.sleep(1000);
        driver.quit();
    }

    public static void MultipleSelection() throws Exception{
        setup();
        Select select = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> languages = select.getOptions();
        for(WebElement option: languages){
            Thread.sleep(1000);
            select.selectByVisibleText(option.getText());
            System.out.println(option.getText());

        }

        Thread.sleep(2000);
        driver.quit();
    }

    public static void InvisibleDropDown() throws Exception{
        setup();
        WebElement element = driver.findElement(By.cssSelector("a[id='dropdownMenuLink']"));
        WebElement website = driver.findElement(By.xpath("//a[text()='Google']"));
        element.click();
        Thread.sleep(500);
        website.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);

        driver.quit();
    }
}
