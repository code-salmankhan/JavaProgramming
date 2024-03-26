package day8;

public class Student
{
	int SId;
	String SName;
	char Grade;
	
	void show()
	{
		System.out.println(SId+"    "+SName+"     "+Grade);
	}
	
	void setData(int id,String name, char g)
	{
	 	SId=id;
	 	SName=name;
	 	Grade=g;
	}
	
	Student(int id,String name, char g)
	{
		SId=id;
	 	SName=name;
	 	Grade=g;
	 	
	}

}
