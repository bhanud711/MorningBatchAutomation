package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement multi = driver.findElement(By.xpath("//select[@id='second']"));
	Select s=new Select(multi);
	//s.selectByIndex(1);
	//s.selectByIndex(0);
	//s.selectByValue("pizza");
	//s.selectByValue("donut");
	s.selectByVisibleText("Burger");
	s.selectByVisibleText("Bonda");
	s.selectByVisibleText("Pizza");
	s.selectByVisibleText("Donut");
	s.deselectByValue("donut");
	s.deselectAll();
	
	}

}
