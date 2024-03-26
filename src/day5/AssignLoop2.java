package day5;

public class AssignLoop2 
{

	public static void main(String[] args) 
	{
	  int number=454 ,reverse = 0;
	  	  
	  int temp=number;
	  
	  while(number>0)
	  {
		  int remainder = number%10;
		  reverse = (reverse*10)+remainder;
		  number = number/10;
	  }
	  
	  System.out.println(reverse);
	  
	  if(temp==reverse)
	  {
		  System.out.println("Palindrome number");
	  }
	  else
	  {
		  System.out.println("Not Palindrome");
	  }

	}

}
