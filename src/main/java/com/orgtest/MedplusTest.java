package com.orgtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MedplusTest {

	
	@Test(enabled=false)
	public void medplus()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
