package exception;

public class ExceptionExamples {
	int a=10,b;
	static String s="";
	static int a1[]= {1,2,3,4};
	
	
	public void display() {
		try {
		System.out.println("Result"+(b=a/0));}
		/*catch(Exception e) {
			System.out.println("The exception thrown  is"+e);
		}*/
		finally {
			System.out.println("Important piece of code in finally");
		}
	}

	

	public static void main(String[] args) {
		ExceptionExamples obj=new ExceptionExamples();
		System.out.println("before exception");
		//obj.display();
		System.out.println("length"+s.length());
		System.out.println("Index"+a1[4]);
		System.out.println("Rest of the code");
	}

}
//null pointer exception
//array index outofbound