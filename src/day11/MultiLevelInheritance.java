package day11;


	class A2                           //parent
	{
		int  a=10;
		
		void display()
		{
		System.out.println(a);	
		}
	}

	class B2 extends A2                 //child
	{
		int b=20;
		void show()
		{
			System.out.println(b);
		}
	}
	
	class C2 extends B2                 //sub child
	{
		int c=30;
		void present()
		{
			System.out.println(c);
		}
	}

	
	public class MultiLevelInheritance 
	{

	  public static void main(String[] args) 
	  { 
		C2 C2_Obj = new C2();
		  
		  System.out.println(C2_Obj.a);
		  System.out.println(C2_Obj.b);
		  System.out.println(C2_Obj.c);

		  
		  C2_Obj.present();
		  C2_Obj.show();
		  C2_Obj.display();

	  }

    }
