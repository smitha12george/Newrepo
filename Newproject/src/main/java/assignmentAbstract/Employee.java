package assignmentAbstract;

public abstract class Employee {
	protected long payment;
	public Employee(long payment)
	{
		this.payment = payment;
		
	}
	
	
	
	public abstract long calculateSalary(); 

}
