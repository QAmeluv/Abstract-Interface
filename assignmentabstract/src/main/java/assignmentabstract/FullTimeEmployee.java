package assignmentabstract;

public class FullTimeEmployee extends Employee {
	public double payhr=11;
	public final double workinghrs=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee fullemp=new FullTimeEmployee();
		fullemp.calculateSalary();
	}

	@Override
	public void calculateSalary() {
		System.out.println("The salary is "+(payhr*workinghrs));
		
	}

}
