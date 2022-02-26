package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.switchTo().frame("iframeResult");
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		button.click();
	}

}
