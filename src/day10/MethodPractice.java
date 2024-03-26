package day10;

public class MethodPractice 
{
	
	
	public static void main(int a)
	{
		System.out.println(a);
	}
	
	public static void main(int a, int b)
	{
		System.out.println(a+b);
		main(a);
	}
	
	public static void main(String a[])
	{
		
		main(10);
		main(20, 30);
	}

}
