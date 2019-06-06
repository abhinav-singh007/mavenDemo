package com.testYantra.mavenDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JKDemoOne 
{
	@Test
	public void TestOne()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
}
