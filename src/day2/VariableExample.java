package day2;

public class VariableExample
{
  public static void main(String args[])
  {
	  //Data Types
	  /*
	   1) premitive 
	   
	   byte,short,int,long--> integer type
	   float,double --------> decimal type
	   char-----------------> single character
	   boolean--------------> true/false
	   
	   2) Non-premitive/collections/derived datatype
	   
	   String
	   ArrayList
	   HashSet
	   HashMap
	   etc...
	   
	   Data Type   Size     Description
	   ---------------------------------------------------------------
	   byte        1 byte   Stores whole numbers from -128 to 127
  	   short       2 bytes  Stores whole numbers from -32768 to 32767
	   int         3 bytes  Stores whole numbers from -2,147,483,648 to 2,147,483,647
	   long        4 bytes  Stores whole numbers from -9223372036854775808 to 9223372036854775807
 	   
 	   float       4 bytes   Stores fractional numbers. Sufficient for storing 7 decimal digits. 
  	   double      8 bytes   Stores fractional numbers. Sufficient for storing 15 decimal digits. 
	   
	   boolean     1 bit     Stores true or false
	   char        2 bytes   Stores a single character/letter
	   
	   */  
       int a;
       a=10;
       //or
       
       int b=10;     
       int c=a+b;       
       System.out.println("Result is : " + a +" + "+ b + " = " + c);
                  
       long x= 1245876677;     
	   byte by =-100;   
	   short sh = 3276;   
	   float f = 32.4563f;  
	   double d = 56784.45565675;
	   char cr ='A';   
	   boolean bo = true;
	   
	   System.out.println(x+" , "+by+ " , "+sh +" , "+f+ " , "+d);
	   System.out.println("Grad of the student : " +cr);
       System.out.println(bo);
       
       String str1 = "S";  
       String str2 = "123"; //String is stored not number
       
       System.out.println(str1+" , "+ str2);
	   
       //String always defined in "" and char in ''   
       System.out.println("Welcome"+100);
       System.out.println("Welcome"+"100");
       System.out.println("100"+"100");
       System.out.println(100+100);    
       /*
       int x;
       float x;
       not possible same name two data type
       */     
       //possible
       int i=100;
       i=300;
  }
}
