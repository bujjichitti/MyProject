package coreJavaPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GmailWithJunit
{
	@Before
	public void intialization()
	{
		launchApplication();
		loginToApplication();
	}
	@After
	public void cleanUp()
	{
		logoutFromApplication();
		closeApplication();
	}
	//*****************Test SUites************
	//That should not be static, should return only void,no arguments to the test
	@Test
	public void smoke()
	{
		System.out.println("Smoke Suite");
		composeAndSendAnEmail();
		replyToAnEmail();
		//return 22;
	}
	@Test
	public void regression()
	{
		System.out.println("Regression Suite");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}
	//******************Test Cases****************
	@Test
	public  void composeAndSendAnEmail()
	{
		System.out.println("Test Case :composeAndSendAnEmail ");
		//launchApplication();
		//loginToApplication();
		goToInbox();
		compose();
		send();
		//logoutFromApplication();
		//closeApplication();
	}
	@Test
	public  void replyToAnEmail()
	{
		System.out.println("Test Case :replyToAnEmail ");
		//launchApplication();
		//loginToApplication();
		goToInbox();
		open();
		reply();
		//logoutFromApplication();
		//closeApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case :forwardAnEmail ");
		//launchApplication();
		//loginToApplication();
		goToInbox();
		open();
		forward();
		//logoutFromApplication();
		//closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case :deleteAnEmail ");
		//launchApplication();
		//loginToApplication();
		goToInbox();
		open();
		delete();
		//logoutFromApplication();
		//closeApplication();
	}
	
	
	//*************Reusable Components***********************
	private void launchApplication()
	{
		System.out.println("RC :Launch Application ");
	}
	private  void loginToApplication()
	{
		System.out.println("RC :Login To Application ");
	}
	private  void compose()
	{
		System.out.println("RC :Compose Mail ");
	}
	private  void goToInbox()
	{
		System.out.println("RC :Go To Inbox  ");
	}
	private  void send()
	{
		System.out.println("RC :Send the Mail  ");
	}
	private  void logoutFromApplication()
	{
		System.out.println("RC :Logout From Application ");
	}
	public  void closeApplication()
	{
		System.out.println("RC :Close Application ");
	}
	
	public  void open()
	{
		System.out.println("RC :Open The Mail ");
	}
	public  void reply()
	{
		System.out.println("RC :Reply to the Mail ");
	}
	public  void forward()
	{
		System.out.println("RC :Forward the Mail ");
	}
	public  void delete()
	{
		System.out.println("RC :Delete the Mail  ");
	}

}
