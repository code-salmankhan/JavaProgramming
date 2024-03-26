package day11;

class A1                 //parent
{
	int  a=10;
	
	void display()
	{
	System.out.println(a);	
	}
}

class B1 extends A1        //child
{
	int b=20;
	void show()
	{
		System.out.println(b);
	}
}




public class SingleInheritance {

	public static void main(String[] args)
	{
	  B1 B1_Obj = new B1();
	  
	  System.out.println(B1_Obj.a);
	  System.out.println(B1_Obj.b);

	  
	  B1_Obj.show();
	  B1_Obj.display();

	}

}
