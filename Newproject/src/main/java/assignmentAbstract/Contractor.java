package assignmentAbstract;

public class Contractor extends Employee {
	

	long time;
	
	public  Contractor(long payment ,long time)
	 {
		super(payment); 
		this.time = time;
	 }

	@Override
	public long calculateSalary() {
		// TODO Auto-generated method stub
		long salary = payment*time;
		return salary;
	}
	 
	
	

	



	

}
