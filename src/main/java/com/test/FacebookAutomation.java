package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.id("email")).sendKeys("rama");
driver.findElement(By.name("pass")).sendKeys("rama123");
//driver.findElement(By.name("login")).click();
//driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.partialLinkText("Forgotten")).click();
	}

}
