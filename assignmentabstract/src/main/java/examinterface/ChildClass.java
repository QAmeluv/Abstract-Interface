package examinterface;

public class ChildClass extends ParentClass {
	
	public void display(String t) {
		super.display(t);
		System.out.println("Inside child class and the string is "+t);
		
	}

	public static void main(String[] args) {
//		ChildClass child=new ChildClass();
//		child.display("Reshma");
		
		ParentClass parent=new ChildClass();//upcast
		parent.display("Reshma");
		

		
		

	}

}
