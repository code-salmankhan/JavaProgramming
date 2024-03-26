package day8;

public class Employee 
{
	int EId;
	String EName;
	String Job;
	int Salary;
	
	void Display()
	{
	  	System.out.println(EId);
	  	System.out.println(EName);
	  	System.out.println(Job);
	  	System.out.println(Salary);
	}
		

	public static void main(String[] args) 
	{
	  System.out.println("------- 1st Obj---------");	
		
      Employee emp1 = new Employee();
      emp1.EId = 101;
      emp1.EName = "John";
      emp1.Job = "Engineer";
      emp1.Salary = 10000;
      
      emp1.Display();
      
      System.out.println("---------2nd Obj ----------");
      
      Employee emp2 = new Employee();
      
      emp2.EId = 105;
      emp2.EName = "Marry";
      emp2.Job = "Tester";
      emp2.Salary = 15000;
      
      emp2.Display();
      

	}

}
