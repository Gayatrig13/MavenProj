package com.maven.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTitleTest
{
	@Test
	public void GetTitleTest()
	{
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://google.com");
	//driver.get("http://gmail.com");
	System.out.println(driver.getTitle());
	driver.quit();
	}
}
