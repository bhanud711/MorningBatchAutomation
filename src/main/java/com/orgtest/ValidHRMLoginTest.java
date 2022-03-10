package com.orgtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidHRMLoginTest {

	@Test(dataProvider="Authentication")
	public void login(String data1,String data2 )
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(data1);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(data2);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	
	@DataProvider(name="Authentication")
	public Object[][] credentails()
	{
		return new Object[][] {{"Admin","admin123"}};
	}
}
