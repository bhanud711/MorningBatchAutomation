package com.orgtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest {
     @Test(threadPoolSize=2,invocationCount=4)
	public void popup()
	{
    	 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
    	 ChromeDriver driver=new ChromeDriver();
    	 driver.get("https://demoqa.com/alerts");
    	 System.out.println("ThreadID"+Thread.currentThread().getId());
    	 driver.manage().window().maximize();
    	 System.out.println(driver.getTitle());
    	 System.out.println(driver.getCurrentUrl());
	}
}
