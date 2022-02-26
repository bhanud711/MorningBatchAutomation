package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement button = driver.findElement(By.xpath("//input[@name='Submit']"));
		Actions a=new Actions(driver);
		//a.moveToElement(username).sendKeys("Rama").build().perform();
		a.sendKeys(username, "Admin").build().perform();
		a.sendKeys(pwd, "admin123").build().perform();
		//a.moveToElement(button).click().build().perform();
		a.click(button).build().perform();
		WebElement leave = driver.findElement(By.xpath("//b[text()='Leave']"));
		WebElement Entitlements = driver.findElement(By.xpath("//a[text()='Entitlements']"));
		WebElement AddEntitlements = driver.findElement(By.xpath("//a[text()='Add Entitlements']"));
		a.moveToElement(leave).moveToElement(Entitlements).moveToElement(AddEntitlements).click().build().perform();
	}

}
