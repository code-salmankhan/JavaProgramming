package day11;


class A3                     // parent
{
	int  a=10;
	
	void display()
	{
	System.out.println(a);	
	}
}

class B3 extends A3          //1st child
{
	int b=20;
	void show()
	{
		System.out.println(b);
	}
}

class C3 extends A3           //2nd child
{
	int c=30;
	void present()
	{
		System.out.println(c);
	}
}





public class HeirarchyInheritance {

	public static void main(String[] args) 
	{
		
		
		  
		  
        B3 B3_Obj = new B3();
		  
		  System.out.println(B3_Obj.a);
		  System.out.println(B3_Obj.b);
		//  System.out.println(B3_Obj.c);  Error because B3 has no connection with C3,  connection with A3 

		  
		 // B3_Obj.present();   Error because B3 has no connection with C3, connection with A3 
		  B3_Obj.show();
		  B3_Obj.display();  
		
		  
		  
        C3 C3_Obj = new C3();
		  
		  System.out.println(C3_Obj.a);
		//  System.out.println(C3_Obj.b);   Error because C3 has no connection with B3, connection with A3 
		  System.out.println(C3_Obj.c);

		  
		  C3_Obj.present();
	//	  C3_Obj.show();        Error because C3 has no connection with B3, , connection with A3 
		  C3_Obj.display();
		
	}

}
