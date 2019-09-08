package coreJavaPractice;

public class GmailWithMainMethod {

	public static void main(String[] args)
	{
		System.out.println("Gmail With Main Method");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
		
	}
	
	public static void composeAndSendAnEmail()
	{
		System.out.println("Test Case :composeAndSendAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	public static void replyToAnEmail()
	{
		System.out.println("Test Case :replyToAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	
	public static void forwardAnEmail()
	{
		System.out.println("Test Case :forwardAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	
	public static void deleteAnEmail()
	{
		System.out.println("Test Case :deleteAnEmail ");
		launchApplication();
		loginToApplication();
		goToInbox();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	
	
	//************************************
	public static void launchApplication()
	{
		System.out.println("RC :Launch Application ");
	}
	public static void loginToApplication()
	{
		System.out.println("RC :Login To Application ");
	}
	public static void compose()
	{
		System.out.println("RC :Compose Mail ");
	}
	public static void goToInbox()
	{
		System.out.println("RC :Go To Inbox  ");
	}
	public static void send()
	{
		System.out.println("RC :Send the Mail  ");
	}
	public static void logoutFromApplication()
	{
		System.out.println("RC :Logout From Application ");
	}
	public static void closeApplication()
	{
		System.out.println("RC :Close Application ");
	}
	
	public static void open()
	{
		System.out.println("RC :Open The Mail ");
	}
	public static void reply()
	{
		System.out.println("RC :Reply to the Mail ");
	}
	public static void forward()
	{
		System.out.println("RC :Forward the Mail ");
	}
	public static void delete()
	{
		System.out.println("RC :Delete the Mail  ");
	}
}
