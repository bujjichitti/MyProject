package coreJavaPractice;

import java.util.ArrayList;

import org.junit.Test;

public class Collections
{
	//Modifier[opt] DataType name[] = {values};
	@Test
	public void integerStaticArray()
	{
		int numbers[] = {23,45,23,45,23,56,34,8,4,34,56,45};
		int len = numbers.length;
		System.out.println("Length :" + len);
		//name[index];
		//for(iterator int=name;condition;step size) { }
		for(int i=0;i<len;i=i+1)
		{
			int val = numbers[i];
			System.out.println("Elements before writing :" + val);
		}
		for(int i=0;i<len;i=i+1)
		{
			 numbers[i] = 22+i;
			 System.out.println("Elements after writing :" + numbers[i]);
			
		}
		for(int i=0;i<len;i=i+1)
		{
			 
			 numbers[i] = 22 + numbers[i];
			 System.out.println("Elements after after writing :" + numbers[i]);
			 
		}
	}
	@Test
	public void stringStaticArray()
	{
		//int numbers[] = {23,45,23,45,23,56,34,8,4,34,56,45};
		String names[] = {"Ram","Ravi","Roja","Raki","Ramu"};
		int len = names.length;
		System.out.println("Length :" + len);
		//name[index];
		//for(iterator int=name;condition;step size) { }
		for(int i=0;i<len;i=i+1)
		{
			String val = names[i];
			System.out.println("Elements before writing :" + val);
		}
		for(int i=0;i<len;i=i+1)
		{
			names[i] = "Selenium-"+i;
			 System.out.println("Elements after writing :" + names[i]);
			
		}
		for(int i=0;i<len;i=i+1)
		{
			 
			names[i] = "Java" + names[i];
			 System.out.println("Elements after after writing :" + names[i]);
			 
		}
	}
	@Test
	public void integerdynamicArray()
	{
		//int numbers[] = {23,45,23,45,23,56,34,8,4,34,56,45};
		int numbers[] = new int[15];
		int len = numbers.length;
		System.out.println("Length :" + len);
		//name[index];
		//for(iterator int=name;condition;step size) { }
		for(int i=0;i<len;i=i+1)
		{
			int val = numbers[i];
			System.out.println("Elements before writing :" + val);
		}
		for(int i=0;i<len;i=i+1)
		{
			 numbers[i] = 22+i;
			 System.out.println("Elements after writing :" + numbers[i]);
			
		}
		for(int i=0;i<len;i=i+1)
		{
			 
			 numbers[i] = 22 + numbers[i];
			 System.out.println("Elements after after writing :" + numbers[i]);
			 
		}
	}
	@Test
	public void stringDynamicArray()
	{
		//int numbers[] = {23,45,23,45,23,56,34,8,4,34,56,45};
		//String names[] = {"Ram","Ravi","Roja","Raki","Ramu"};
		String names[] = new String[15];
		int len = names.length;
		System.out.println("Length :" + len);
		//name[index];
		//for(iterator int=name;condition;step size) { }
		for(int i=0;i<len;i=i+1)
		{
			String val = names[i];
			System.out.println("Elements before writing :" + val);
		}
		for(int i=0;i<len;i=i+1)
		{
			names[i] = "Selenium-"+i;
			 System.out.println("Elements after writing :" + names[i]);
			
		}
		for(int i=0;i<len;i=i+1)
		{
			 
			names[i] = "Java" + names[i];
			 System.out.println("Elements after after writing :" + names[i]);
			 
		}
	}
	@Test
	public void listConcatenation()
	{
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			numbers1.add(22+i);
		}
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(numbers1);
		for(int i=0;i<10;i++)
		{
			numbers2.add(44+i);
		}
		for(int i =0;i<numbers2.size();i++)
		{
			System.out.println("Elements after adding :" + numbers2.get(i));
		}
		System.out.println("List Size :" + numbers2.size());
		//numbers2.remove(numbers1);
		numbers2.removeAll(numbers1);
		for(int i =0;i<numbers2.size();i++)
		{
			System.out.println("Elements after removing :" + numbers2.get(i));
		}
		System.out.println("List Size :" + numbers2.size());
		numbers2.set(4, 23423545);
		for(int i =0;i<numbers2.size();i++)
		{
			System.out.println("Elements after removing :" + numbers2.get(i));
		}
		System.out.println("List Size :" + numbers2.size());
	
	}
	@Test
	public void integerArrayList()
	{
		//int nums[] = {23,45,23,45,23,56,34,8,4,34,56,45};
		//int numbers[] = new int[15];
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();
		int len = numbers.size();
		System.out.println("Length :" + len);
		for(int i=0;i<len;i=i+1)
		{
			int val = numbers.get(i);
			System.out.println("Elements before writing :" + val);
		}
		for(int i=0;i<15;i=i+1)
		{
			 numbers.add(22+i);
			 System.out.println("Elements after writing :" + numbers.get(i));
			
		}
		System.out.println("Length after :" + numbers.size());
		numbers.add(78);
		for(int i =0;i<numbers.size();i++)
		{
			System.out.println("Elements after writing :" + numbers.get(i));
		}
		System.out.println("Length after 78 :" + numbers.size());
		numbers.add(4, 98);
		for(int i =0;i<numbers.size();i++)
		{
			System.out.println("Elements after writing :" + numbers.get(i));
		}
		System.out.println("Length after 98 :" + numbers.size());
		numbers.add(26);
		numbers.remove(4);
		for(int i =0;i<numbers.size();i++)
		{
			System.out.println("Elements after writing :" + numbers.get(i));
		}
		System.out.println("Length removing 26 :" + numbers.size());
	}
}
