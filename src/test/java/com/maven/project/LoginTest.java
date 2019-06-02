package com.maven.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest 
{
	@Test
	public void LoginTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.quit();
		
	/*	driver.get("http://recruit.cyberfreshers.com");
		driver.findElement(By.id("username")).sendKeys("ritesh.cyberpodium@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sainath1981");
		driver.findElement(By.id("loginsubmit")).click();		
		driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/div[12]/div/div/ul/li[4]/a/img")).click(); */
	}
}
