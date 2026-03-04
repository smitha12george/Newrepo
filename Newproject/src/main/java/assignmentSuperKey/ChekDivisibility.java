package assignmentSuperKey;

public class ChekDivisibility extends AddTwoNumbers {

	  
	void check()
	{
	   super.add(5,4);	
		
	   if(sum % 10 == 0) {
			 System.out.println("sum  is  divisible");
			            }
			 
			 else {
				 System.out.println("  sum is not divisible");
				 
			 }
	   }
			 
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChekDivisibility obj = new ChekDivisibility();
		obj.check();

	}

}
