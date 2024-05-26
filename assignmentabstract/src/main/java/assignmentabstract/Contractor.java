package assignmentabstract;

public class Contractor extends Employee {
	public  double payphr=10;
	double workinghrs;
	
	Contractor(double workinghrs){
		this.workinghrs=workinghrs;
	}

	
	@Override
	public void calculateSalary() {
		System.out.println("The salary is "+(payphr*workinghrs));
		
	}
	public static void main(String[] args) {
		Contractor con=new Contractor(8);
		con.calculateSalary();

	}

}
