package exception;

public class StydyingTry {
	
	public static void testing() {
		
		int a=10,b=0,c;
		try {
		c=a/b;}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("closing");
		}
		
	}

	public static void main(String[] args) {
		testing();
		
		System.out.println("Rest of the code");

	}

}
