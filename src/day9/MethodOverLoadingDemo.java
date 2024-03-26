package day9;

public class MethodOverLoadingDemo 
{
	
	int x,y,z;
	double d;
	
	void sum()
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	
	void sum(int a, int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);	
	}
	
	void sum(int a, double b)
	{
		x=a;
		d=b;
		System.out.println(x+d);	
	}
	
	void sum(double a, int b)
	{
		d=a;
		y=b;
		System.out.println(d+y);	
	}
	
	
	public static void main(String args[])
	{
	  MethodOverLoadingDemo mo = new MethodOverLoadingDemo();
	  mo.sum();
	  mo.sum(10, 40);
	  mo.sum(20.3, 40);
	  mo.sum(40, 20.4);
		
	}

}
