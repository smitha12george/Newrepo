package assignmentAbstract;

public   class FullTimeEmployee extends Employee {
	
	
	FullTimeEmployee(long payment)
	{
		super(payment);
	     

	}
	
	
	
	@Override
	public long calculateSalary() {
		// TODO Auto-generated method stub
		long salary = payment*8;
		return salary;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contractor      temp    = new Contractor(2000L,6L);
		FullTimeEmployee   per =  new FullTimeEmployee(2000L);
		
		System.out.println("payment for permanent Employee is  "+per.calculateSalary());
		System.out.println("payment for temporary Employee is   "+temp.calculateSalary());

	}

	
	
		
	}
 

