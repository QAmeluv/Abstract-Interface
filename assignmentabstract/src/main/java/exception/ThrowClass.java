package exception;

public class ThrowClass {
	
	public static void eligible(int age) {
		if(age>=18) {
			System.out.println("Eligible");
		}
		
		else {
			
     throw new ArithmeticException("age less than 18, so not eligible");
			
		}
		
		
	}

	public static void main(String[] args) {
		
eligible(17);
	}

}
