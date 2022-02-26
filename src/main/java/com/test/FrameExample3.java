package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.switchTo().frame("frame1");
		WebElement textField = driver.findElement(By.xpath("//b[text()='Topic :']/following::input"));
		textField.sendKeys("Ramarao");
		driver.switchTo().frame("frame3");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
	}

}
