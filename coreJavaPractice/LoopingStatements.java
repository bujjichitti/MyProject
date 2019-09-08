package coreJavaPractice;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void printFiveNumbers()
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}
	@Test
	public void printTwentyNumbers()
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}
	@Test
	public void printFive()
	{
		//for(iterator int name ; condition ; step size) { }
		for(int i =1;i<=5;i = i +1)
		{
			System.out.println(i);
		}
	}
	@Test
	public void printTwenty()
	{
		//for(iterator int name ; condition ; step size) { }
		for(int i =1;i<=20;i = i +1)
		{
			System.out.println(i);
		}
	}
	@Test
	public void printTwentyFive()
	{
		//for(iterator int name ; condition ; step size) { }
		for(int i =1;i<=25;i = i +1)
		{
			System.out.println(i);
		}
	}
	
	@Test
	public void workWithForLoop()
	{
		printNumbers(35);
	}
	public void printNumbers(int n)
	{
		//for(iterator int name ; condition ; step size) { }
		for(int i =1;i<=n;i = i +1)
		{
			System.out.println(i);
		}
	}
	@Test
	public void printEvenNumbers()
	{
		//for(iterator int name ; condition ; step size) { }
		for(int i =0;i<=20;i = i + 2)
		{
			System.out.println(i);
		}
	}
	@Test
	public void printOddNumbers()
	{
		//for(iterator int name ; condition ; step size) { }
		for(int i =1;i<=20;i = i + 2)
		{
			System.out.println(i);
		}
	}


}
