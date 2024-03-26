package day9;

public class ThisKeyword 
{
   
	int x,y;  //instance variable/ class variable
     
	void setData(int x,int y) //local variable/method variable 
	{
		this.x=x;  //this keyword is differentiate between instance and local variable 
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
	  ThisKeyword tk = new ThisKeyword();
	  tk.setData(10, 30);
	  tk.display();

	}

}
