package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQ1 {

	public static void main(String[] args) {
		// TODO Auto-gener.ated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
	}

}
