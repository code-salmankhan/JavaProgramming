package day4;

public class ifCondition
{
	public static void main(String args[])
	{
		//if condition
		int age =18;
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		
		//if....else
		int num = -10;
		
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		
		//if.... else if.... else if
		if(num==0)
		{
			System.out.println("Number is zero");
		}
		else if(num>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
		
		
		//largest number a b c conditional and logical
		
		int a=10, b=50, c=20;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater : "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater : "+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater : "+c);
		}
		
		
		//if else more ex
		if(false)
		{
			if(false)
			{
				System.out.println("123");
			}
			else
			{
				System.out.println("456");
			}
		 }
		 else
		 {
			System.out.println("xyz");
		  }
		
		
		
	}

}
