package customexception;

public class LicenseException extends Exception {
	public LicenseException(String s){
//		System.out.println("The error is "+s);
		super(s);
	}

}
