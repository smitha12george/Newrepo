package aggregation;

public class AddressChild {
	
	String city;
	String country;
	ParentAddress ref;
	AddressChild (String city,String country,ParentAddress ref)
	{
	this.city = city;
	this.country = country;
	this.ref = ref;
		
	}
	 void display()
	 {
		 System.out.println(ref.town); 
		 System.out.println(ref.post); 
		 System.out.println(city); 
		 System.out.println(country); 
		 
		 
	 }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAddress obj1 = new ParentAddress("Dubai",123);
		AddressChild  obj2 = new AddressChild("asd","uae",obj1);
         obj2.display();
   
	}

}
