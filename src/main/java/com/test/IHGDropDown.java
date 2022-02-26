package com.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
WebElement dropDown = driver.findElement(By.xpath("//select[@id='country']"));
	Select s=new Select(dropDown);
	//s.selectByIndex(2);
	//s.selectByValue("GB");
	s.selectByVisibleText("United Kingdom");
	List<WebElement> opt = s.getOptions();
	System.out.println(opt.size());
	/*Iterator<WebElement> it = opt.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next().getText());	
	}
	*/
	for(WebElement each:opt)
	{
	System.out.println(each.getText());	
	}
	}

}
