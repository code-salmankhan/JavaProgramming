package day9;

public class Messenger 
{
    String msg;
	
    Messenger(String msg)
    {
    	this.msg=msg;
    }
    
    void writeMsg()
    {
    	System.out.println(msg);
    }
    
    void readMsg()
    {
    	writeMsg();
    }
    
	public static void main(String[] args) 
	{
		Messenger m = new Messenger("All the best");
		m.readMsg();
		

	}

}
