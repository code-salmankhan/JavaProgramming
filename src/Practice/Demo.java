package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo 
{
		
	public static void main(String args[])
	{
		String s1 = "foo-bar";
		String s2 = new String("foo-bar");
		
		System.out.println(s1.equals(s2) + " ");
		System.out.println(s1==s2);
		System.out.println(" " + s1.compareTo(s2));
		
		
		String name = "Fred";
		System.out.println("Hello" +   //saying hello
		                       name);  //to Fred 
		System.out.println("Good /* and "+
		                       " greeting */ day!");
		System.out //A welcome message
		                  .println("Welcome "+ name);
		System.out.println("Goodbye /* Farewell + name");
		
		
		int totalScore2 =0;
		
	  
		//int[] num = {1,2,3,4,5};
		
		//int length = num.length;
		/*
		for(int i=0;i<length/2;i++)
		{
			int temp = num[i];
			num[i] = num[length-1-i];
			num[length-1-i]= temp;
		}
		*/
		
		/*
		int i=0;
		while(i<=length/2)
		{
			int temp = num[i];
			num[i] = num[length-1-i];
			num[length-1-i]= temp;	
			i++;
		}
		*/
		
		/*
		int i=0;
		do 
		{
			int temp = num[i];
			num[i] = num[length-1-i];
			num[length-1-i]= temp;	
			i++;
			
		}while(i<length/2);
		*/
		
		/*
		System.out.println(Arrays.toString(num));
		*/
		
		
		
		
	}
	

}
