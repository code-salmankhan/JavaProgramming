package day9;

public class Greeting 
{
	
   //1 No parmas No return calue	
   void greeting1()
   {
	 System.out.println("Hello....");   
   }
   
   //2 No params Returns value
   String greeting2()
   {
	  return "Hello.. How are you?";
   }
   
   //3 Takes params No return value
   void greeting3(String name)
   {
	   System.out.println("Hello : " + name);
   }
   
   //4 take params and return value
   String greeting4(String name)
   {
	   return "Hello : "+name;
	
   }
	
	
}
