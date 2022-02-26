package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandlingTopic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
/*
WebElement button1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
button1.click();
Alert a = driver.switchTo().alert();
Thread.sleep(3000);
a.accept();

//Handling confirmation Alert.
WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
confirm.click();
Thread.sleep(2000);
a.accept();
//a.dismiss();
*/
//Handling prompt Alert.
WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));
	prompt.click();
	Alert b = driver.switchTo().alert();
	b.sendKeys("ramarao");
	b.accept();
	}

}
