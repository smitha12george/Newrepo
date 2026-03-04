 package aggregation;

public class AggregationChild {
	
	
	  String subject;
	  	  
	   int mark;
	   
	   AggregationParent ref;
	  
	  AggregationChild(String subject,int mark, AggregationParent ref)
	  {
		  this.subject = subject;
		  this.mark = mark;
		  this.ref = ref;
	  }
	   void display()
	   {
		   System.out.println("Name is    :"+ref.name);
		   System.out.println("Age is     :"+ref.age);
		   System.out.println("Subject is   :"+subject); 
		   System.out.println("Mark is   :"+mark);
		   
	   }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AggregationParent obj2 = new AggregationParent("smith",45);
		AggregationChild obj = new AggregationChild("Math",23,obj2);
          obj.display();
          
	}

}
