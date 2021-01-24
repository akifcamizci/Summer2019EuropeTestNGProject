package com.Demo.tests;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.cssSelector("input[id='fromPlaceName']")).sendKeys("BEN");
		driver.findElement(By.cssSelector("input[id='fromPlaceName']")).sendKeys(Keys.DOWN);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
	while(!text.equalsIgnoreCase("BENGALURU AIRPORT"))
	{
		driver.findElement(By.cssSelector("input[id='fromPlaceName']")).sendKeys(Keys.DOWN);
		text=(String) js.executeScript(script);
		System.out.println(text);
	}

	}

}
