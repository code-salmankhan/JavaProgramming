package day8;

public class StudentMain 
{

	public static void main(String[] args) 
	{
     	//Student stu = new Student();
     	
		/*
     	//Approach one
     	stu.SId=102;
     	stu.SName="John";
     	stu.Grade='A';
     	
     	stu.show();
     	
     	//Approach two
     	stu.setData(102, "Jaslin", 'B');
     	stu.show();
     	*/
     	
     	//Approach Three Using Constructor
     	Student st = new Student(103,"Monica",'B');
        st.show();
	}

}
