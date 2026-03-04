package assignmentpolymorphism;


public class Offseason extends Onseason {
	
	double dicount(double total)
	  { 
		
		System.out.println("onseason discount is  :"+super.dicount(total));
		
	    total = total * 0.20;
	
			return total;
		
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Offseason obj = new Offseason();
		obj.display();
		System.out.println("offseasondiscount is  :"+obj.dicount(obj.total));
		
		
        

	}

}
