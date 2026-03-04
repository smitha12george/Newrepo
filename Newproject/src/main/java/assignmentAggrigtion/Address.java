package assignmentAggrigtion;

public class Address {
	
	 String town;
	 String city;
	 String country;
     Student ref;
     
     
     Address(String town,String city,String country,Student ref)
     {
    	 this.town = town;
    	 this.city = city;
    	 this.country = country;
    	 this.ref = ref;
     }
   
     void display()
     {
    	 System.out.println("Name       :"+ref.name);
    	 System.out.println("Rollnumber :"+ref.rollnumber);
    	System.out.println("City       :"+city);
    	 System.out.println("Town       :"+town);
    	 System.out.println("country    :"+country);
     }
     
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Student student = new Student("Anu",23);
		
		Address address = new Address("Furjan","Dubai","UAE",student);
		
		address.display();
		 
	} 
		 
	}
	



