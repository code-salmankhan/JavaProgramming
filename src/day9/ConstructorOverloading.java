package day9;

public class ConstructorOverloading 
{	int x,y;
  	double d;
  	
  	ConstructorOverloading()
  	{
  		x=10;
  		y=20;
  		System.out.println(x+y);
  	}
  	
  	ConstructorOverloading(int a, int b)
  	{
  		x=a;
  	    y=b;
  	    System.out.println(x+y);
  	}
  	
  	ConstructorOverloading(int a, double b)
  	{
  		x=a;
  	    d=b;
  	    System.out.println(x+d);
  	}
  	
  	ConstructorOverloading(double a, int b)
  	{
  		d=a;
  	    y=b;
  	    System.out.println(x+d);
  	}
  	
  	void display()
  	{
  		System.out.println("---------");
  		System.out.println(x);
  		System.out.println(y);
  		System.out.println(d);
  	}
  	
	public static void main(String[] args) 
	{
		ConstructorOverloading co1 = new ConstructorOverloading();	
		ConstructorOverloading co2 = new ConstructorOverloading(10,40);	
		ConstructorOverloading co3 = new ConstructorOverloading(10,40.56);
		ConstructorOverloading co4 = new ConstructorOverloading(45.7,10);
			  	
         co1.display();
         co2.display();
         co3.display();
         co4.display();
	}

}
