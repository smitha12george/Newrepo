package assignmentEncapsulation;
import java.util.Scanner;

public class User {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank ob = new Bank();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name   ");
		ob.setname(sc.next());
		System.out.println("Welcome "+ob.getname());
		ob.setpin(100112341212L);
		System.out.print("Enter your pin   ");
		
	       long newpin =  sc.nextLong();
	       
	    if(newpin == ob.getpin()) {
	    	System.out.println("proceed with login");}
	    else
	    {
	    	System.out.println("Incorrrect  pin");
	    }
	     

	}

}
