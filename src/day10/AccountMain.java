package day10;

public class AccountMain 
{

	public static void main(String[] args) 
	{
		Account accObj = new Account();
		
		accObj.setAcc_no(1234);
		accObj.setName("Apoorva");
		accObj.setAmount(10000.00);

		System.out.println(accObj.getAcc_no());
		String s =accObj.getName();
		System.out.println(s);
		
		System.out.println(accObj.getAmount());
		
		
	}

}
