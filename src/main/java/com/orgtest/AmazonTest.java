package com.orgtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonTest {

	@Test(alwaysRun=true,groups= {"regression","sanity"})
	public void amazon()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String url="https://www.amazon.i/";
		//HardAssert	
		//Assert.assertTrue(driver.getCurrentUrl().equals(url));
		//Hard Assert upto above line
		
		
		SoftAssert a=new SoftAssert();
		a.assertTrue(driver.getCurrentUrl().equals(url));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
