package com.orgtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShopDemoTest {

	
	@Test()
	public void demoQA()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
