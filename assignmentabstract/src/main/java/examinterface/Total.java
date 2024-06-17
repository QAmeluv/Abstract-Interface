package examinterface;

public class Total implements AdditionInterface {
	
	@Override
	public void display() {
		System.out.println("Me just display a sample program");
		
	}


	public static void main(String[] args) {
		
		Total tot=new Total();
		tot.display();
	}

	
}
