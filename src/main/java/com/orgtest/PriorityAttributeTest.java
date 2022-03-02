package com.orgtest;

import org.testng.annotations.Test;

public class PriorityAttributeTest {
	
	@Test(priority=1)
	public void oranage()
	{
		System.out.println("Hello Orange");
	}
	@Test(priority=2)
	public void banana()
	{
		System.out.println("banana");
	}
	@Test(priority=0)
	public void grapes()
	{
		System.out.println("grapes");
	}

}
