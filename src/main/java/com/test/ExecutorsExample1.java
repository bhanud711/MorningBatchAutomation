package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutorsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('txtUsername').value='Admin';");
		WebElement user = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		js.executeScript("arguments[0].value='Admin';", user);
		
		
		//js.executeScript("document.getElementById('btnLogin').click();");
		WebElement button = driver.findElement(By.xpath("//input[@class='button']"));
		js.executeScript("arguments[0].click();", button);
		String url="";
		url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		String title="";
		title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		js.executeScript("history.go(0)");
		
		js.executeScript("window.scrollBy(0,500)");
	}

}
