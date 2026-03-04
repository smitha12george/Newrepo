package assignment;

public class AllDetails extends TotalSalary {
	
	
	
	     void display()
	     {
	    	 
	    	 System.out.println("   Salary Slip    ");
	   	     System.out.println("   ...............    "); 
	   	     System.out.println("Employee name is    "+name);
	   	    
	   	     System.out.println("Bsic Pay            "+basicpay);
	   	     
	   	    System.out.println("Bonus                "+bonus);
	   	     System.out.println("Deduction           "+deduction);
	   	    
	   	      System.out.println("Pf                 "+pf);
	   	      
	   	      System.out.println("Hra                "+hra);
	   	     
	   	      System.out.println("Salary             "+totalsalary);
	    	 
	    	 
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AllDetails obj = new  AllDetails();

	  System.out.println("   Salary Slip    ");
	  System.out.println("   ...............    ");
	  
	
	 obj.employee(); 
	 obj.calculate();
	 obj. total();
	 obj.display();
	}

	private char[] emoployee(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
