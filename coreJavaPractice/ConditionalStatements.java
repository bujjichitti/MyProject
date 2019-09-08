package coreJavaPractice;

import org.junit.Test;

public class ConditionalStatements
{
	int a = 25;
	int b = 22;
	@Test
	public void ifCondition()
	{
		//if(expression :- boolean -> true / false) { }
		if(a == b)
		{
			System.out.println("Both A and B are equal");
		}
	}
	//not be static, no arguments, dont return anything
	@Test
	public void workWithIfElse()
	{
		ifElseCondition(24,56);
		ifElseCondition(56,56);
		//Total lines covered / toal lines written  * 100
	}
	public void ifElseCondition(int a,int b)
	{
		//if(expression :- boolean -> true / false) { }
		if(a == b)
		{
			System.out.println("Both A and B are equal,A value :"+ a + "  , B value :" + b);
		}
		else
		{
			System.out.println("Both A and B are not equal,A value :"+ a + "  , B value :" + b);
		}
	}
	@Test
	public void workWithElseIf()
	{
		elseIfCondition(23,56);
		elseIfCondition(56,56);
		elseIfCondition(78,56);
	}
	public void elseIfCondition(int a,int b)
	{
		//if(expression :- boolean -> true / false) { }
		if(a == b)
		{
			System.out.println("Both A and B are equal,A value :"+ a + "  , B value :" + b);
		}
		else if(a > b)
		{
			System.out.println("A is above B,A value :"+ a + "  , B value :" + b);
		}
		else if (a < b)
		{
			System.out.println("A is below B,A value :"+ a + "  , B value :" + b);
		}
	}
	@Test
	public void workWithNestedIf()
	{
		nestedIf(4,18);
		nestedIf(14,8);
		nestedIf(4,8);
		nestedIf(44,18);
		nestedIf(14,18);
		nestedIf(14,14);
	}
	public void nestedIf(int a,int b)
	{
		if(( a > 10) && (b > 10))
		{
			if(a > b)
			{
				System.out.println("Difference :" + (a-b));
			}
			else if(a < b)
			{
				System.out.println("Sum :" + (a+b));
			}
			else
			{
				System.out.println("Both are equal");
			}
		}
		else
		{
			System.out.println("Any or both of A and B are less than 10 , A and B values :" + a + " , " + b);
		}
	}
	@Test
	public void workWithSwitchCase()
	{
		switchCase('A');
		switchCase('B');
		switchCase('D');
		switchCase('G');
		switchCase('E');
		switchCase('F');
		switchCase('C');
	}
	public void switchCase(char grade)
	{
		switch(grade)
		{
		case 'A' :
		{
			System.out.println("Student passed in Distinction, Grade :" + grade);
			break;
		}
		case 'B' :
		{
			System.out.println("Student passed in First class, Grade :" + grade);
			break;
		}
		case 'C' :
		{
			System.out.println("Student passed in Second class, Grade :" + grade);
			break;
		}
		case 'D' :
		{
			System.out.println("Student passed in third class, Grade :" + grade);
			break;
		}
		case 'E' :
		{
			System.out.println("Student passed , Grade :" + grade);
			break;
		}
		case 'F' :
		{
			System.out.println("Student passed Failed, Grade :" + grade);
			break;
		}
		default :
		{
			System.out.println("Grade is unknown , Grade :" + grade);
			break;
		}
		}
	}
}
