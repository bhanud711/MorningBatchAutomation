package com.orgtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MedplusTest {

	
	@Test(groups= {"regression"})
	public void medplus()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.medplusmart.com/");	
		String url="https://www.medplusmart";
		//Assert.assertTrue(driver.getCurrentUrl().equals(url));
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(driver.getCurrentUrl().equals(url));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
}
