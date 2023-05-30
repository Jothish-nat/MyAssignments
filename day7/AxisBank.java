package week3.day7;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("New Deposit");
	}
	
   	public static void main(String[] args) {
	// TODO Auto-generated method stub
   		
   		BankInfo B = new BankInfo();
   		B.deposit();
        //B.saving();
        //B.fixed();
   		
   	}

}
