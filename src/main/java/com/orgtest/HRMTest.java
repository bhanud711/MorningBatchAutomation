package com.orgtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMTest extends IHGTest {
	 @Test(dependsOnMethods="tth")
		public void orangeHRM()
		{
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		}
}
