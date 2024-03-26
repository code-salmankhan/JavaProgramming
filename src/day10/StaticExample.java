package day10;

public class StaticExample 
{
    static int a=10; // static variable
	int b=20;        // non-static
	
	static void m1()  // static method
	{
		System.out.println("this is static method");
	}
	
	
	void m2()  // non-static method
	{
		System.out.println("this is non-static method");
	}
	
	
	//3. non static method can access anything variable or method directly without any objects
	void m3()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	
	
	public static void main(String[] args)     // main method is static method
    {
		//1. Static method can access static stuff directly (without object)
		
		System.out.println(a);
	  //System.out.println(b);  //incorrect , bcz b is non-static variable
	
		m1(); // We are able to access static method without obj
        
		
		//2. Static methods can access non-static stuff through obj
		
	  StaticExample se = new StaticExample();
	  System.out.println(se.b);
	  se.m2();
	  
	  
	  se.m3();
	  
	}

}
