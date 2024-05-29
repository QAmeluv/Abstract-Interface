package exception;

public class StudyingThrowThrows {
	
	public static void testing(int age) throws MyException  {
		
		if(age<18) {
			
			//either we can use try catch to handle the throw
//			try {
//			throw new MyException("My custoemr exception");}
//			catch(MyException e) {System.out.println(e);}		
			throw new MyException("My custoemr exception");
		}
		else {
			System.out.println("eligible for vote");
		}	
		
	}
	public static void main(String[] args)  {
		try {
		testing(17);}
		catch(MyException e) {
			
		}
			
		System.out.println("rest of the code");

	}
	
	public static void test() throws MyException  {
		testing(17);
	}

}
