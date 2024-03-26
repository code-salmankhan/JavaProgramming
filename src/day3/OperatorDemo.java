package day3;

public class OperatorDemo 
{
	 public static void main(String args[])
	 {
		//Type of operators
		 /*
		  
		  1. Arithmetic operators + - * / %
		  2. Relational/comparison operators >  >=  <  <=  !=  == 
		  3. logical operators &&  ||  !
		  4. Increment & Decrement operator ++  --
		  5. Assignment =  +=  -=  *=  /=  %=
		  6. conditional/ternary operator ?
		  
		  */
		 
		 int a=20, b=10;
		
		 //Arithmetic
		 System.out.println("\n----Arithmetic-----");
		 System.out.println("Sum : " +(a+b));
		 System.out.println("Sub : " +(a-b));
		 System.out.println("Mul : " +(a*b));
		 System.out.println("Div : " +(a/b));
		 System.out.println("Mod : " +(a%b));
		 
		 //Relational
		 System.out.println("----Relational-----");
		 System.out.println(a>b); //true
		 System.out.println(a<b); //false 	 
		 b=20;
		 System.out.println(a>=b); //true
		 System.out.println(a<=b); //true		 
		 System.out.println(a!=b); //false
		 System.out.println(a==b); //true
		 
		 
		 //logical (can be used between 2 or more boolean values & return boolean value true or false)	 
		 boolean x=true;
		 boolean y=false;
		 
		 System.out.println("\n----Logical-----");
		 System.out.println(x && y);
		 System.out.println(x || y);
		 System.out.println(!x);
		 System.out.println(!y);
		 
		 System.out.println("\n----Increment-----");	 
		 int i=10;
		 int j=20;
		 int ri=i++; //i=i+1 //post-increment ri is storing i value before increment
		 int rj=++j; //j+1=j //pre-increment rj is storing j value after increment
		 
		 System.out.println(ri+" , "+rj);
		 System.out.println(i + " , "+j);
			 
		 //AssignmentOperator		 
		 System.out.println("\n----AssignmentOperator-----");			
		 int as=10;
		 //as=as+5;
		 as+=5; //both are same
		 
		 System.out.println(as);
		 
		 
         //Ternary 
		 System.out.println("\n----TernaryOperator-----");
		
		 // var=exp ? result1 : result2
		 
		 int t1=200, t2=100;
		 
		 int t= (t1>t2) ? t1:t2; //if result is true t1:t2 t1 will execute and assign value 
		 System.out.println(t);
		 
          t= (t1<t2) ? t1:t2; //if result is false t1:t2 t2 will execute and assign value 
		 System.out.println(t);
		 
		 int age=20;
		 
		 String res = (age>=18)? "Eligible to vote":"Not Eligible to vote";
		 System.out.println(res);
		 
	 }

}
