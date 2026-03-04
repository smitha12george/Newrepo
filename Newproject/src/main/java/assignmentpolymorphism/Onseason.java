package assignmentpolymorphism;
import java.util.Scanner;
public class Onseason {
	
	double total;
	 
	
	double dicount(double total)
	  {
		this.total = total;
		
	      total = total * 0.40;
	
			return total;
			
		
		
	}
	
	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total amount  :");
		total = sc.nextDouble();
		
	}

}
