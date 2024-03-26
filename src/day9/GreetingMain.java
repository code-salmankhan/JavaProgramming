package day9;

public class GreetingMain 
{

	public static void main(String[] args) 
	{
		Greeting gr = new Greeting();
		gr.greeting1();
		
		
		System.out.println(gr.greeting2());
		
		gr.greeting3("Salman");
		
        System.out.println(gr.greeting4("AT"));
	}

}
