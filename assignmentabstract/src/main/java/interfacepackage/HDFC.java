package interfacepackage;

public class HDFC implements RBI {
	double total;

	

	@Override
	public void recurringDeposit(double amount, double duration) {
		total=((interest_rate/100)*amount*duration)+amount;
		System.out.println("You will get a total of "+total+" after "+duration+" years");	
	}
   public static void main(String[] args) {
	   HDFC hd=new HDFC();
	   hd.recurringDeposit(50000, 10);
		

	}

}
