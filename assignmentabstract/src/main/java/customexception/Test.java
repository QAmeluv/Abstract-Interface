package customexception;

public class Test {
	
	public static void eligible(int age) throws LicenseException {
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new LicenseException(" Not Eligible");
			
		}
	}

	public static void main(String[] args) throws LicenseException {
		
		eligible(17);
	}

}
