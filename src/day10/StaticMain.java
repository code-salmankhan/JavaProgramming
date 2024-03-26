package day10;

public class StaticMain {

	public static void main(String[] args) {
		
		
		// if class are different for main and static then we need to define other class name before calling variable or method
		
	
				System.out.println(StaticExample.a);  // Other class name where we define static variable
			
				StaticExample.m1(); // Other class name where we define static method
				
				
			  StaticExample se = new StaticExample();
			  System.out.println(se.b);
			  se.m2();
			  
			  
			  se.m3();
	}

}
