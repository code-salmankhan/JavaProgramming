package day7;

public class stringDemo {

	public static void main(String[] args) 
	{
		String s = "Welcome";
		
		System.out.println(s);
		
		System.out.println(s.length());
		
		String s1="Welcome";
		String s2="to java";
		String s3="Automation";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		
		s="   Automation   ";
		System.out.println(s.length()); //19
		System.out.println(s.trim().length());//10
		
		s="welcome";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(5));
		
		System.out.print(s.charAt(6));
		System.out.print(s.charAt(5));
		System.out.print(s.charAt(4));
		System.out.print(s.charAt(3));
		System.out.print(s.charAt(2));
		System.out.print(s.charAt(1));
		System.out.println(s.charAt(0));
		
		System.out.println(s.contains("wel"));  //true
		System.out.println(s.contains("come"));             //true
		System.out.println(s.contains("Wel"));              //false (case sensitive)
		
		s1="WELCOME";
		s2="welcome";
		
		System.out.println(s1.equals(s2));  //false
		System.out.println(s1.equalsIgnoreCase(s2));  //true
		
		
		//replace single /multiple character in a string
		s="welcome to selenium automation";
		s=s.replace('e', 'X');
		System.out.println(s);
		
		s="welcome to selenium automation";
		System.out.println(s.replace("selenium","java"));
		
		s="welcome";
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(0,7));
		
		//split
		s="abc@gmail.com";
		String a[] =s.split("@");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		
	}

}
