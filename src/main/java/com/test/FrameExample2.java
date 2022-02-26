package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		//Thread.sleep(4000);
		driver.switchTo().frame("SingleFrame");
		WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
		textField.sendKeys("Ramarao");
		
	}

}
