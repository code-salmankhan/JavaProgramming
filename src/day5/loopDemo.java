package day5;

public class loopDemo 
{
	public static void main(String arg[])
	{
		
	//While Loop
	System.out.println("----- while Loop -----");
		 	
		
	int w=0;
	
	 while(w<20)
	   {
		
		//check even or not
		if(w%2==0)
		{
			System.out.print("Even : ");
		}
		w=w+2;
		System.out.println(w);
				
	   }
	 
	 //Do while   once it will run without any condition
	 System.out.println("----- do while Loop -----");
	 
	 
	 int d=10;
	 
	 do
	 {
		 System.out.println(d);
		 d--;
	 }while(d>=1);
	
	
	 //for loop
	 System.out.println("----- For Loop -----");
	 
	 
	 
	 for(int f=1;f<=10;f++)
	 {		 
		System.out.println(f); 
		
	 }
	 
	
	
	}
}
