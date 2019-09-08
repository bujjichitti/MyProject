package coreJavaPractice;
public class CoreJavaPractice
{
	public static String collegeName = "JNTU";
	public int empNum = 22;
	char grade = 'A';
	boolean result = false;
	String _collegeName;
	String $collegeName;
	String CollegeName;
	String studentName;
	static int  sal;
	static public  void main(String abc[])
	{
		System.out.println("Original MainMethod");
		System.out.println("Welcome To Selenium Java");
		addition();
		addition(25);
		addition(45,23);
		int val = addition1();
		System.out.println("Employee Salary [1,0] : " + val);
		val = addition1(24,45);
		System.out.println("Employee Salary [1,1] : " + val);
		//return 22;
		main("Selenium",314);
	}
	public static void main(String abc,int num)
	{
		System.out.println("Overloaded main method");
		System.out.println("Welcome To Selenium Java");
		addition();
		addition(25);
		addition(45,23);
		int val = addition1();
		System.out.println("Employee Salary [1,0] : " + val);
		val = addition1(24,45);
		System.out.println("Employee Salary [1,1] : " + val);
		//return 22;
	}
	public static void main(String abc,int num,char val1)
	{
		System.out.println("Overloaded main method");
		System.out.println("Welcome To Selenium Java");
		addition();
		addition(25);
		addition(45,23);
		int val = addition1();
		System.out.println("Employee Salary [1,0] : " + val);
		val = addition1(24,45);
		System.out.println("Employee Salary [1,1] : " + val);
		//return 22;
	}
	// 0 ,0 
	public static void addition()
	{
		sal = 22+25;
		System.out.println("Employee Salary [0,0] :" + sal);
	}
	//0 , 1
	public static void addition(int basic)
	{
		sal = basic + 15;
		System.out.println("Employee Salary with one arg [0,1] :" + sal);
	}
	//0 , 1
	public static void addition(int basic,int hike)
	{
		 sal = basic + hike;
		System.out.println("Employee Salary with two args [0,1] :" + sal);
	}
	//1,0
	public static int addition1()
	{
		 sal = 20+15;
		return sal;
	}
	//1 , 1
	public static int addition1(int basic,int hike)
	{
		 sal = basic + hike;
		return sal;
	}
	

}

class Gmail
{
	
}

class Yahoo
{
	
}

 class HotMail
{
	
}
