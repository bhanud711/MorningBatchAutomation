package com.orgtest;

import org.testng.annotations.Test;

public class DepenedsonmethodAttributeTest {
	@Test(dependsOnMethods="elephant")
	public void lion()
	{
		System.out.println("I am Lion");
	}
	@Test
	public void tiger()
	{
		System.out.println("Hello I am tiger");
	}
	@Test(dependsOnMethods="tiger")
	public void elephant()
	{
		System.out.println("Hello i am elephant");
	}
}
