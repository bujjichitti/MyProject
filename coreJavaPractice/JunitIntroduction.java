package coreJavaPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitIntroduction 
{
	@Before
	public void intialization()
	{
		launchApplication();
		loginToApplication();
	}
	public void launchApplication()
	{
		System.out.println("RC :Launch Application ");
	}
	//@Before
	public void loginToApplication()
	{
		System.out.println("RC :Login To Application ");
	}
	@After
	public void cleanUp()
	{
		logoutFromApplication();
		closeApplication();
	}
	public void logoutFromApplication()
	{
		System.out.println("RC :Logout From Application ");
	}
	//@After
	public void closeApplication()
	{
		System.out.println("RC :Close Application ");
	}
	@Test
	public void smoke()
	{
		System.out.println("Smoke Suite");
		compose();
		reply();
	}
	@Test
	public void regression()
	{
		System.out.println("Regression Suite");
		compose();
		reply();
		forward();
		delete();
	}
	@Test
	public void compose()
	{
		System.out.println("Test Case  : Compose");
	}
	@Test
	public void reply()
	{
		System.out.println("Test Case  : Reply");
	}
	@Test
	public void forward()
	{
		System.out.println("Test Case  : Forward");
	}
	@Test
	public void delete()
	{
		System.out.println("Test Case  : Delete");
	}

}
